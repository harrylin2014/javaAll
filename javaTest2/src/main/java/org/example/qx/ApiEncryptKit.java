package org.example.qx;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * 针对org.apache.commons.codec.binary.Base64，
 * 需要导入架包commons-codec-1.9（或commons-codec-1.8等其他版本）
 * 官方下载地址：http://commons.apache.org/proper/commons-codec/download_codec.cgi
 */
/**
 * 说明：异常java.security.InvalidKeyException:illegal Key Size的解决方案
 * <ol>
 * 	<li>在官方网站下载JCE无限制权限策略文件（
 * 	JDK8的下载地址：http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html
 * 	JDK7的下载地址：http://www.oracle.com/technetwork/java/javase/downloads/jce-7-download-432124.html
 * 	JDK6的下载地址：http://www.oracle.com/technetwork/java/embedded/embedded-se/downloads/jce-6-download-429243.html</li>
 *
 * 	<li>下载后解压，可以看到local_policy.jar和US_export_policy.jar以及readme.txt</li>
 * 	<li>如果安装了JRE，将两个jar文件放到%JRE_HOME%\lib\security目录下覆盖原来的文件</li>
 * 	<li>如果安装了JDK，将两个jar文件放到%JDK_HOME%\jre\lib\security目录下覆盖原来文件</li>
 * </ol>
 */

/**
 * api通信签名/加密/解密工具
 * @author june
 * 2016年03月24日 09:04
 */
public class ApiEncryptKit {

    private static Charset CHARSET = Charset.forName("utf-8");
    private static int BLOCK_SIZE = 32;

    /**
     * 对明文进行加密.
     * @param text 需要加密的明文
     * @param encodingAesKey 密钥
     * @param appName 应用名称
     * @return 加密后base64编码的字符串
     */
    public static String encrypt(String text, String encodingAesKey, String appName) {
        if (encodingAesKey.length() != 43) {
            throw new RuntimeException("SymmetricKey非法");
        }
        byte[] aesKey = Base64.decodeBase64(encodingAesKey + "=");
        ByteGroup byteCollector = new ByteGroup();
        byte[] randomStrBytes = getRandomStr(16).getBytes(CHARSET);
        byte[] textBytes = text.getBytes(CHARSET);
        byte[] networkBytesOrder = getNetworkBytesOrder(textBytes.length);
        byte[] appNameBytes = appName.getBytes(CHARSET);

        // randomStr + networkBytesOrder + text + appName
        byteCollector.addBytes(randomStrBytes);
        byteCollector.addBytes(networkBytesOrder);
        byteCollector.addBytes(textBytes);
        byteCollector.addBytes(appNameBytes);

        // ... + pad: 使用自定义的填充方式对明文进行补位填充
        byte[] padBytes = PKCS7Encoder.encode(byteCollector.size());
        byteCollector.addBytes(padBytes);

        // 获得最终的字节流, 未加密
        byte[] unencrypted = byteCollector.toBytes();

        try {
            // 设置加密模式为AES的CBC模式
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            SecretKeySpec keySpec = new SecretKeySpec(aesKey, "AES");
            IvParameterSpec iv = new IvParameterSpec(aesKey, 0, 16);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, iv);

            // 加密
            byte[] encrypted = cipher.doFinal(unencrypted);

            // 使用BASE64对加密后的字符串进行编码
            Base64 base64 = new Base64();
            String base64Encrypted = base64.encodeToString(encrypted);

            return base64Encrypted;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("aes加密失败");
        }
    }

    /**
     * 对密文进行解密.
     * @param text 需要解密的密文
     * @param encodingAesKey 密钥
     * @param appName 应用名称
     * @return 解密得到的明文
     */
    public static String decrypt(String text, String encodingAesKey, String appName) {
        if (encodingAesKey.length() != 43) {
            throw new RuntimeException("SymmetricKey非法");
        }
        byte[] aesKey = Base64.decodeBase64(encodingAesKey + "=");
        byte[] original;
        try {
            // 设置解密模式为AES的CBC模式
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            SecretKeySpec key_spec = new SecretKeySpec(aesKey, "AES");
            IvParameterSpec iv = new IvParameterSpec(Arrays.copyOfRange(aesKey, 0, 16));
            cipher.init(Cipher.DECRYPT_MODE, key_spec, iv);

            // 使用BASE64对密文进行解码
            byte[] encrypted = Base64.decodeBase64(text);

            // 解密
            original = cipher.doFinal(encrypted);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("aes解密失败");
        }

        String content, from_appName;
        try {
            // 去除补位字符
            byte[] bytes = PKCS7Encoder.decode(original);

            // 分离16位随机字符串,网络字节序和appName
            byte[] networkOrder = Arrays.copyOfRange(bytes, 16, 20);

            int msgLength = recoverNetworkBytesOrder(networkOrder);

            content = new String(Arrays.copyOfRange(bytes, 20, 20 + msgLength), CHARSET);
            from_appName = new String(Arrays.copyOfRange(bytes, 20 + msgLength, bytes.length),
                    CHARSET);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("解密后得到的buffer非法");
        }

        // appName不相同的情况
        if (!from_appName.equals(appName)) {
            throw new RuntimeException("appName校验失败");
        }
        return content;

    }

    /**
     * 用SHA1算法生成安全签名
     * @param appName   应用名称
     * @param timestamp 时间戳
     * @param nonce     随机字符串
     * @return 签名
     */
    public static String getSHA1(String appName, String timestamp, String nonce) {
        try {
            String[] array = new String[]{appName, timestamp, nonce};
            StringBuffer sb = new StringBuffer();
            // 字符串排序
            Arrays.sort(array);
            for (int i = 0; i < 3; i++) {
                sb.append(array[i]);
            }
            String str = sb.toString();
            // SHA1签名生成
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.update(str.getBytes());
            byte[] digest = md.digest();

            StringBuffer hexstr = new StringBuffer();
            String shaHex = "";
            for (int i = 0; i < digest.length; i++) {
                shaHex = Integer.toHexString(digest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexstr.append(0);
                }
                hexstr.append(shaHex);
            }
            return hexstr.toString();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("sha加密生成签名失败");
        }
    }

    /**
     * 校验签名
     *
     * @param signature 用户传入的签名
     * @param appName   传入的应用名
     * @param timestamp 时间戳
     * @param nonce     随机字符串
     * @return 签名是否正确
     */
    public static boolean checkSignature(String signature, String appName, String timestamp, String nonce) {
        if (isEmpty(signature)
                || isEmpty(appName)
                || isEmpty(timestamp)
                || isEmpty(nonce)) {
            return false;
        }
        String msgSignature = getSHA1(appName, timestamp, nonce);
        if (signature.equals(msgSignature)) {
            return true;
        }
        return false;
    }
    private static boolean isEmpty(Object str) {
        return (str == null || "".equals(str));
    }

    // 生成4个字节的网络字节序
    private static byte[] getNetworkBytesOrder(int sourceNumber) {
        byte[] orderBytes = new byte[4];
        orderBytes[3] = (byte) (sourceNumber & 0xFF);
        orderBytes[2] = (byte) (sourceNumber >> 8 & 0xFF);
        orderBytes[1] = (byte) (sourceNumber >> 16 & 0xFF);
        orderBytes[0] = (byte) (sourceNumber >> 24 & 0xFF);
        return orderBytes;
    }

    // 还原4个字节的网络字节序
    private static int recoverNetworkBytesOrder(byte[] orderBytes) {
        int sourceNumber = 0;
        for (int i = 0; i < 4; i++) {
            sourceNumber <<= 8;
            sourceNumber |= orderBytes[i] & 0xff;
        }
        return sourceNumber;
    }

    // 随机生成16位字符串
    private static String getRandomStr(int size) {
        String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 随机生成43位随机密钥
     * @return
     */
    public static String getRandomKey(){
        return getRandomStr(43);
    }

    private static class ByteGroup {
        ArrayList<Byte> byteContainer = new ArrayList<Byte>();

        private byte[] toBytes() {
            byte[] bytes = new byte[byteContainer.size()];
            for (int i = 0; i < byteContainer.size(); i++) {
                bytes[i] = byteContainer.get(i);
            }
            return bytes;
        }

        private ByteGroup addBytes(byte[] bytes) {
            for (byte b : bytes) {
                byteContainer.add(b);
            }
            return this;
        }

        private int size() {
            return byteContainer.size();
        }
    }

    /**
     * 提供基于PKCS7算法的加解密接口.
     */
    private static class PKCS7Encoder {
        /**
         * 获得对明文进行补位填充的字节.
         *
         * @param count 需要进行填充补位操作的明文字节个数
         * @return 补齐用的字节数组
         */
        private static byte[] encode(int count) {
            // 计算需要填充的位数
            int amountToPad = BLOCK_SIZE - (count % BLOCK_SIZE);
            if (amountToPad == 0) {
                amountToPad = BLOCK_SIZE;
            }
            // 获得补位所用的字符
            char padChr = chr(amountToPad);
            String tmp = new String();
            for (int index = 0; index < amountToPad; index++) {
                tmp += padChr;
            }
            return tmp.getBytes(CHARSET);
        }

        /**
         * 删除解密后明文的补位字符
         *
         * @param decrypted 解密后的明文
         * @return 删除补位字符后的明文
         */
        private static byte[] decode(byte[] decrypted) {
            int pad = (int) decrypted[decrypted.length - 1];
            if (pad < 1 || pad > 32) {
                pad = 0;
            }
            return Arrays.copyOfRange(decrypted, 0, decrypted.length - pad);
        }

        /**
         * 将数字转化成ASCII码对应的字符，用于对明文进行补码
         *
         * @param a 需要转化的数字
         * @return 转化得到的字符
         */
        private static char chr(int a) {
            byte target = (byte) (a & 0xFF);
            return (char) target;
        }

    }


}
