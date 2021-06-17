package org.example;

import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.Base64Utils;

import javax.crypto.SecretKey;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author lxl
 * @date 2021/3/20 13:02
 */
public class TestEncrypt {
    public static void main(String[] args) {
        SecretKey secretKey = SecureUtil.generateKey("AES", 256);

        String keyStr = "root";
        byte[] keys;
        try {
            keys = keyStr.getBytes("UTF-8");
            System.out.println(Base64Utils.encodeToString(Arrays.copyOf(keys, 16)));
        } catch (UnsupportedEncodingException e) {

        }


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("phoneId", "32F9D4D9-09CD-4116-8AA3-2B70BEA52181");
        jsonObject.put("loginName", "HR13C000336");
        StringBuilder sb = new StringBuilder();
        jsonObject.put("avatar", sb.toString());
        //String  test = ApiEncryptKit.encrypt(jsonObject.toJSONString(),"ff6244f654e44796a877b0d6151e58d5epemty1uhsw","vipAppName");
        String test = "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";
        System.out.println("test:" + test);

        System.out.println("result:" + ApiEncryptKit.decrypt(test, "ff6244f654e44796a877b0d6151e58d5epemty1uhse", "gate_way_encrypt"));


        System.out.println("result:" + ApiEncryptKit.encrypt("cityCode=101030100", "ff6244f654e44796a877b0d6151e58d5epemty1uhse", "gate_way_encrypt"));

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("test1", "test1");
        jsonObject1.put("test2", "test2");

        System.out.println("result:" + ApiEncryptKit.encrypt(jsonObject1.toJSONString(), "ff6244f654e44796a877b0d6151e58d5epemty1uhse", "gate_way_encrypt"));


        System.out.println("解密1：" + ApiEncryptKit.decrypt("Gy2b9N2f7szy3mxgLogqSEqzHp2i05lCIKrmAQ79e1v1rGaCVdbhmtOzzX5kHmTW+LhyBv52dT6te/der2Vaog==", "ff6244f654e44796a877b0d6151e58d5epemty1uhse", "gate_way_encrypt"));

        System.out.println("解密2：" + ApiEncryptKit.decrypt(ApiEncryptKit.encrypt(jsonObject1.toJSONString(), "ff6244f654e44796a877b0d6151e58d5epemty1uhse", "gate_way_encrypt"), "ff6244f654e44796a877b0d6151e58d5epemty1uhse", "gate_way_encrypt"));
    }
}


