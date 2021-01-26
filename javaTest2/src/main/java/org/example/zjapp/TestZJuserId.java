package org.example.zjapp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lxl
 * @date 2020/9/10 10:59
 */
public class TestZJuserId {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(TestZJuserId.class);
    private static PoolingHttpClientConnectionManager cm;
    private static HttpRequestRetryHandler httpRequestRetryHandler;
    private static CloseableHttpClient httpClient;
    private static RequestConfig requestConfig;
    private static int default_connTime = 6000;
    protected static String default_charset = "utf-8";

    private static String token = "";//暂未放入 redis
    static {
        ConnectionSocketFactory plainsf = PlainConnectionSocketFactory.getSocketFactory();
        LayeredConnectionSocketFactory sslsf = MySSLConnectionSocketFactory.getSocketFactory();
        Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", plainsf)
                .register("https", sslsf)
                .build();

        cm = new PoolingHttpClientConnectionManager(registry);
        // 将最大连接数增加到500
        cm.setMaxTotal(500);
        // 将每个路由基础的连接增加到100
        cm.setDefaultMaxPerRoute(200);
        // 将大数据目标主机的链接数增大到100

        httpRequestRetryHandler = new HttpRequestRetryHandler() {
            public boolean retryRequest(IOException exception, int executionCount, org.apache.http.protocol.HttpContext context) {
                if (executionCount >= 5) {// 如果已经重试了5次，就放弃
                    return false;
                }
                if (exception instanceof NoHttpResponseException) {// 如果服务器丢掉了连接，那么就重试
                    return true;
                }
                if (exception instanceof SSLHandshakeException) {// 不要重试SSL握手异常
                    return false;
                }
                if (exception instanceof InterruptedIOException) {// 超时
                    return true;
                }
                if (exception instanceof UnknownHostException) {// 目标服务器不可达
                    return true;
                }
                if (exception instanceof ConnectTimeoutException) {// 连接被拒绝
                    return true;
                }
                if (exception instanceof SSLException) {// ssl握手异常
                    return false;
                }

                HttpClientContext clientContext = HttpClientContext.adapt(context);
                HttpRequest request = clientContext.getRequest();
                // 如果请求是幂等的，就再次尝试
                if (!(request instanceof HttpEntityEnclosingRequest)) {
                    return true;
                }
                return false;
            }
        };

        httpClient = HttpClients.custom()
                .setConnectionManager(cm)
                // .setRetryHandler(httpRequestRetryHandler)
                .build();
        //如果使用本地chareles进行抓包,需要设置代理服务器,用http即可,不需要使用Https
        //HttpHost proxy = new HttpHost("127.0.0.1",8888,"http");
        // 配置请求的超时设置
        requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(default_connTime)    //请求超时时间
                .setConnectTimeout(default_connTime)              //连接超时时间
                .setSocketTimeout(default_connTime)               //
                //.setProxy(proxy)                      //设置代理服务器(如果需要本地抓包,开启此设置.)
                .build();
    }


    public static String doPostUrl(String url, List<BasicNameValuePair> headerParas, JSONObject json) throws Exception {
        Long startTime = System.currentTimeMillis();
        HttpPost post = new HttpPost(url);
        if (headerParas!=null && headerParas.size()>0) {
            for (BasicNameValuePair para: headerParas) {
                post.addHeader(para.getName(), para.getValue());
            }
        }
        post.setConfig(requestConfig);
        CloseableHttpResponse response = null;
        String result = "";
        StringEntity entity = new StringEntity(json.toString(),"utf-8");

        try {
            post.setEntity(entity);
            response = httpClient.execute(post);
            HttpEntity responseEntity = response.getEntity();
            result = getResultContent(responseEntity);
            EntityUtils.consume(responseEntity);
            logger.error("调用POST接口:{},header:{},参数:{},返回:{},共消耗时间{}ms",
                    url, JSON.toJSONString(headerParas),json.toJSONString(),result, System.currentTimeMillis() - startTime);
        }catch (Exception e) {
            logger.error("调用POST接口:{},header:{},参数:{},失败,共消耗时间{}ms,异常{}",
                    url, JSON.toJSONString(headerParas),json.toJSONString(), System.currentTimeMillis() - startTime,e.getMessage());
            throw new Exception("httpPost调用URL失败",e);
        }finally {
            try {
                if(response != null){
                    response.close();
                }
            } catch (IOException e) {
                throw new Exception("关闭HttpClient失败",e);
            }
        }
        return result;
    }

    public static String getResultContent(HttpEntity entity) throws IOException {
        String result = "";
        if (entity != null) {
            InputStream instream = entity.getContent();
            try {
                result = EntityUtils.toString(entity, "utf-8");
            } finally {
                instream.close();
            }
        }
        return result;
    }
    private  static String getUhomeUserIdUrl  = "https://uws.abcd.net/ucs/uia/find/uhome-userId"; //通过PSI用户中心的用户ID和UHome的systemId获取UHome的用户ID的服务。
    private static String uhomeAppId = "SV-SHFW660-0000";
    private static String uhomeAppKey = "f654561eb10f0964185ae7bf73533899";
    public static void main(String args[]){
        JSONObject uid_params = new JSONObject();
        uid_params.put("uocUserId", "65429220");
        try {
            String timestamp = System.currentTimeMillis() + "";
            List<BasicNameValuePair> headerList = new ArrayList<BasicNameValuePair>();
            headerList.add(new BasicNameValuePair("systemId", uhomeAppId));
            headerList.add(new BasicNameValuePair("sequenceId",timestamp+""));
            headerList.add(new BasicNameValuePair("timestamp", timestamp));
            headerList.add(new BasicNameValuePair("language","zh-CN"));
            headerList.add(new BasicNameValuePair("timezone", "8"));
            headerList.add(new BasicNameValuePair("apiVersion", ""));
            headerList.add(new BasicNameValuePair("Content-Type","application/json;charset=UTF-8"));
            String sign = getSign(uhomeAppId, uhomeAppKey, timestamp, uid_params.toJSONString(), getUhomeUserIdUrl);
            headerList.add(new BasicNameValuePair("sign", sign));
            String response = doPostUrl(getUhomeUserIdUrl, headerList, uid_params);
            JSONObject responseJson = (JSONObject) JSONObject.parse(response);
            if ("00000".equals(responseJson.getString("retCode"))) {
                JSONObject uidJson = (JSONObject) JSONObject.parse(responseJson.getString("payload"));
                String uid = uidJson.getString("uHomeUserId");
                logger.error("uid："+uid);
            } else {

                logger.error("调用智家接口获取智家id失败： " + responseJson.getString("retInfo"));

            }
        } catch (Exception e) {
            logger.error("调用智家接口获取智家id失败： "+e.getMessage());
            e.printStackTrace();
        }
    }

    private static String getSign(String appId, String appKey, String timestamp, String body, String url) throws MalformedURLException {
        URL urlObj = new URL(url);
        url=urlObj.getPath();
        appKey = appKey.trim();
        appKey = appKey.replaceAll("\"", "");
        if (body != null) {
            body = body.trim();
        }else {
            body="";
        }
        if (body!=null && !body.equals("")) {
            body = body.replaceAll(" ", "");
            body = body.replaceAll("\t", "");
            body = body.replaceAll("\r", "");
            body = body.replaceAll("\n", "");
        }
        StringBuffer sb = new StringBuffer();
        sb.append(url).append(body).append(appId).append(appKey).append(timestamp);
//        logger.info("*******加密前字符串----:"+sb);
        MessageDigest md = null;
        byte[] bytes = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
            bytes = md.digest(sb.toString().getBytes("utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return BinaryToHexString(bytes);
    }

    private static String BinaryToHexString(byte[] bytes) {
        StringBuilder hex = new StringBuilder();
        String hexStr = "0123456789abcdef";
        for (int i = 0; i < bytes.length; i++) {
            hex.append(String.valueOf(hexStr.charAt((bytes[i] & 0xF0) >> 4)));
            hex.append(String.valueOf(hexStr.charAt(bytes[i] & 0x0F)));
        }
        return hex.toString();
    }

}
