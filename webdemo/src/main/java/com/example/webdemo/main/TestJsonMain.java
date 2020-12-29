package com.example.webdemo.main;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author lxl
 * @date 2020/12/17 16:33
 */
public class TestJsonMain {

    public static void main(String[] args) {

        String json = JSON.toJSONString("success");

        System.out.println(json);
    }
}
