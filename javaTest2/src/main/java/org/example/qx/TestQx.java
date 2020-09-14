package org.example.qx;

/**
 * @author lxl
 * @date 2020/9/11 13:05
 */
public class TestQx {
    public static void main(String args[]){

        String param = "{\"service_time\":\"17-18\",\"address\":\"河北省 石家庄市 藁城区 12345678998\",\"mobile_phone\":\"18153216783\",\"product_id\":\"16\",\"district\":\"130109\",\"apply_id\":\"3461\",\"customer_name\":\"李瑞敏\",\"require_service_date\":\"2020-09-03\"}";
        String a = ApiEncryptKit.encrypt(param,"I3MRfEBwo06gVjE5JWTFAmdTstTeilguDSodhwdcFJA","HYS_U+");
        System.out.println(a);
        String b = ApiEncryptKit.decrypt(a,"I3MRfEBwo06gVjE5JWTFAmdTstTeilguDSodhwdcFJA","HYS_U+");
        System.out.println(b);
        String c="xTYID3RLfzUhGv5I2qD/FROm+c++3mX5SBtNa5wGBas9ThLEnQYbFJPCFkSDYUZXr6nRpW6KskBsnzj+igIkGLPodYtYlOQBaMCgMfPFqmACIHQlIiKfXOxHxEw8ZIIqK1rIeXf9kddiVr/3qA7K63Qab/8WnOpOmbR3hG9wDzV4z4MR5sm/E4Ptlor2dRoWjCuf/KDUnrPXjvSxWHqaDg==";

        String d = ApiEncryptKit.decrypt("","I3MRfEBwo06gVjE5JWTFAmdTstTeilguDSodhwdcFJA","HYS_U+");
        System.out.println(d);

    }
}
