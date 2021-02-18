package org.example;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;

import java.io.UnsupportedEncodingException;

/**
 * @author lxl
 * @date 2021/2/7 11:28
 */
public class SecurityTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
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
