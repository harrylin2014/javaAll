package org.example;

/**
 * @author lxl
 * @date 2021/1/20 10:04
 */

import java.security.MessageDigest;

/**
 * @author lxl
 * @date 2021/1/19 18:41
 */
public class ActivitySignUtil {

    public static void main(String[] args) {
        System.out.println();
    }
    /**
     * 生成签名（post请求）
     * @param systemKey systemKey
     * @return 签名
     */
    public static String getSign(String param, String systemKey) {
        StringBuffer sb = new StringBuffer();
        String body = replaceSymbol(param);
        sb.append(systemKey).append(body);
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

    private static String replaceSymbol(String body) {
        body = body.replaceAll(" ", "");
        body = body.replaceAll("\t", "");
        body = body.replaceAll("\r", "");
        body = body.replaceAll("\n", "");
        return body;
    }

    public static String BinaryToHexString(byte[] bytes) {
        StringBuilder hex = new StringBuilder();
        String hexStr = "0123456789abcdef";
        for (int i = 0; i < bytes.length; i++) {
            hex.append(hexStr.charAt((bytes[i] & 0xF0) >> 4));
            hex.append(hexStr.charAt(bytes[i] & 0x0F));
        }
        return hex.toString();
    }
}
