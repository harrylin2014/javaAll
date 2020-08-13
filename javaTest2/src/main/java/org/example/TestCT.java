package org.example;

import cn.hutool.http.HttpUtil;

import java.net.URLEncoder;
import java.util.UUID;

/**
 * @author lxl
 * @date 2020/8/12 18:06
 */
public class TestCT {

private static String url =  "http://hccapi.haier.net:10073/";

public static void main(String args[]){
    //String address = "山东省青岛市崂山区中韩街道海尔路1号海尔工业园s座";
    String address = "广西壮族自治区百色市田阳区百育镇九合村濑觉屯5组1号";
    String id = UUID.randomUUID().toString();//生成随机数的区域id
    String param = "{\"id\":\"" + id + "\",\"address\":\"" + address.replace(" ", "") + "\"}";
    String addresses = URLEncoder.encode(param);//url中有汉字或特殊字符(非字母和数字的字符)，实现 转码

    String result1= HttpUtil.get(url+ "/hsiapi/dituhui/fendan?addresses=[" + addresses + "]");

    System.out.println(result1);

}

}
