package org.example.bigData;

import org.apache.commons.lang3.StringUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;

/**
 * @author lxl
 * @date 2020/10/16 15:45
 */
public class TestSign {

    public static void main(String[] args) throws MalformedURLException {
        String body = "{\n" +
                "\t\"userId\":\"2034409031\",\n" +
                "\t\"pageNum\":1,\n" +
                "\t\"pageSize\":100\n" +
                "}";
        String sing = getSign("MB-UZHCC-0001","6dfca8714eb26e3a226t88a1573c8768","1602836154000",body,"http://10.159.59.53:7170/bigdata-operate-rest/operator/sale/order");

        System.out.println(sing);
    }


    static String getSign(String appId, String appKey, String timestamp, String body,String url) throws MalformedURLException {
        URL urlObj = new URL(url);
        url=urlObj.getPath();
        appKey = appKey.trim();
        appKey = appKey.replaceAll("\"", "");
        body = StringUtils.trimToEmpty(body);
        if (body != null) {
            body = body.trim();
        }
        if (!body.equals("")) {
            body = body.replaceAll("", "");
            body = body.replaceAll("\t", "");
            body = body.replaceAll("\r", "");
            body = body.replaceAll("\n", "");
        }
        //log.info("body:"+body);
        StringBuffer sb = new StringBuffer();
        sb.append(url).append(body).append(appId).append(appKey).append(timestamp);

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

    static String BinaryToHexString(byte[] bytes) {
        StringBuilder hex = new StringBuilder();
        String hexStr = "0123456789abcdef";
        for (int i = 0; i < bytes.length; i++) {
            hex.append(String.valueOf(hexStr.charAt((bytes[i] & 0xF0) >> 4)));
            hex.append(String.valueOf(hexStr.charAt(bytes[i] & 0x0F)));
        }
        return hex.toString();
    }




}
