package org.example;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;

import java.io.UnsupportedEncodingException;


import org.apache.commons.codec.binary.Base64;

/**
 * @author lxl
 * @date 2021/2/7 11:28
 */
public class SecurityTest {
    public static void main(String[] args) throws UnsupportedEncodingException {


        StringBuffer temLL=new StringBuffer();

        //temLL.append(new String(java.util.Base64.getDecoder().decode("6bq754Om5Y+R5LiL5pS26LS55riF5Y2VMTQ4MOWFg++8jOaciTDlhrfmsLTnmoTmnLrlrZDkuLrku4DkuYjov5jopoHliqDng63msLTlvqrnjq/msZ4="))).append("\n");

        System.out.println(new String(java.util.Base64.getDecoder().decode("PGltZyB3aWR0aD0nNjYyLjQwMDAwMDAwMDAwMDEnIGhlaWdodD0nMTQzMy42MDAwMDAwMDAwMDAxJyBzcmM9J2h0dHBzOi8vaGFpZXJzZXJ2aWNlZmlsZS5oYWllci5uZXQvY2F0LzIwMjEwMTE0MDEwMzAzMDMyMjQyNi5qcGc")).toString());
        try {
            int a = 1/0;
        }catch (Exception e){

        }

        System.out.println(Base64.decodeBase64("5L2g5aW977yM"));

        System.out.println(java.util.Base64.getEncoder().encodeToString(new String("保养问题怎么处理").getBytes()));




        String content = "test中文";

        String securetyKey = "qwertyuiopasdfgh";

        System.out.println(SecureUtil.md5(content));
        System.out.println(SecureUtil.md5(content));



//随机生成密钥
        byte[] key = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue()).getEncoded();

        System.out.println(new String(key,"UTF-8"));

//构建
        SymmetricCrypto aes = new SymmetricCrypto(SymmetricAlgorithm.AES, securetyKey.getBytes());

//加密
        byte[] encrypt = aes.encrypt(content);
//解密
        byte[] decrypt = aes.decrypt(encrypt);

//加密为16进制表示
        String encryptHex = aes.encryptHex(content);
//解密为字符串
        String decryptStr = aes.decryptStr(encryptHex, CharsetUtil.CHARSET_UTF_8);

        System.out.println(decryptStr);
    }
}
