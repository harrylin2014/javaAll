package org.example;


import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;

public class AesEcbCodec {


    public static void main(String[] args) {

        String timestamp = "1620615075";
        String simestamp = "1620442656";
        long nowTimeStr = System.currentTimeMillis();
        long timeStampStr = Long.parseLong(timestamp)*1000;
        System.out.println(nowTimeStr+":::::"+simestamp);
        if (nowTimeStr - timeStampStr > 60000*10 || timeStampStr - nowTimeStr > 60000*10){
            System.out.println("test");
        }


        String content = "123abcABC*%!~#+_/中文测试";
        // 随机生成密钥
        byte[] key = "ac22634324258e5c".getBytes();

        // 构建
        AES aes = SecureUtil.aes(key);


        String encryptBase64 = aes.encryptBase64(content);
        System.out.println(encryptBase64);

        String decryptBase64 = aes.decryptStr("Fz8LYUZhkssOmgpb1baC2uu9bPHVO5BcrpVikuF/beI=");

        System.out.println(decryptBase64);

    }

}

