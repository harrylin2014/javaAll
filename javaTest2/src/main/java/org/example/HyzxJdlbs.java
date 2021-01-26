package org.example;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.IOException;

/**
 * @author lxl
 * @date 2020/8/17 14:28
 */
public class HyzxJdlbs {

    public static void main(String args[]) throws IOException {

        String sAccessUrl = "http://vipcent.abcd.net/vipcenter/productOrderApi/queryUserRegProductDistinct";
        JSONObject paramStr = new JSONObject();
        paramStr.put("userId", "2047861079"); //用户Id
        paramStr.put("source", "all");//来源默认all

        //应用名
        String sAppName = "apiproduct_casarte";
        //访问参数加密秘钥43位
        String sRequestSecretKey = "ff6244f654e44796a877b0d6151e58d5epemty1uhsw";
        //返回值加密秘钥43位
        String sResponseSecretKey = "1178690e1cea44ce978448c8fa6bcfd1nvoxurapbqs";

        //生成密文
        String sRequestSecretStr = ApiEncryptKit.encrypt(paramStr.toJSONString(), sRequestSecretKey, sAppName);
        Long startTime = System.currentTimeMillis();
        try {
            PostMethod methodPost = new PostMethod(sAccessUrl);
            methodPost.addParameter("appName", sAppName);
            methodPost.addParameter("echoStr", sRequestSecretStr);
            HttpClient httpClient = new HttpClient();
            httpClient.executeMethod(methodPost);
            //获取访问结果，访问结果JSON格式
            String sResponseSecretStr = new String(methodPost.getResponseBody(), "UTF-8");
            JSONObject responseObj = JSONObject.parseObject(sResponseSecretStr);
            if (responseObj == null) {
            }
            boolean isSuccess = responseObj.getBoolean("isSuccess");
            if (isSuccess) {//返回成功
                //获取返回值密文
                String data = responseObj.get("data") == null ? "" : responseObj.getString("data");
                //将密文翻译为明文
                String sResponseStr = ApiEncryptKit.decrypt(data, sResponseSecretKey, sAppName);
                System.out.println(sResponseStr);
            } else {//失败
                String msg = responseObj.getString("msg");
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new IOException("httpGet调用URL失败",e);

        }finally {
        }
    }
}
