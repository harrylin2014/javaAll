package org.example;

import cn.hutool.http.HttpUtil;

import java.net.URLEncoder;
import java.util.UUID;

/**
 * @author lxl
 * @date 2020/8/12 18:06
 */
public class TestCT {

private static String url =  "http://hccapi.abcd.net:10073/";

public static void main(String args[]){
    //String address = "山西 阳泉 矿区 山西省阳泉市矿区洪城河宏居苑3号楼3门10号";
    String address = "山西省 阳泉市 矿区 洪城河宏居苑3楼3门10号";
    //String address = "北京市北京市朝阳区小红门乡";
    String id = UUID.randomUUID().toString();//生成随机数的区域id
    String param = "{\"id\":\"" + id + "\",\"address\":\"" + address.replace(" ", "") + "\"}";
    String addresses = URLEncoder.encode(param);//url中有汉字或特殊字符(非字母和数字的字符)，实现 转码

    String result1= HttpUtil.get(url+ "/hsiapi/dituhui/fendan?addresses=[" + addresses + "]");

    System.out.println(result1.replaceAll("\"values\"","\"results\""));

}

}
