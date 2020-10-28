package com.example.webdemo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lxl
 * @date 2020/10/24 14:07
 */
@Component
public class TestProperties {

    public static String hccUrl;


    @Value("${hcc.url}")
    public void setHccUrl(String hccUrl) {
        TestProperties.hccUrl = hccUrl;
    }
}
