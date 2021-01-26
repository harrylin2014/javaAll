package org.example.equals;

import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.http.impl.client.CloseableHttpClient;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lxl
 * @date 2021/1/19 13:40
 */
public class HashCodeTest {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("a");
        s1.setAge(1);

        Student s2 = s1;

        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode()+":"+s2.hashCode());

        HashMap hm = new HashMap();

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

        StringBuilder sb = new StringBuilder();

        StringBuffer sbu = new StringBuffer();

        String s = new String();


        HttpURLConnection huc;

        CloseableHttpClient closeableHttpClient;

    }
}
