package org.example;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.net.URLEncoder;
import java.sql.SQLOutput;
import java.util.UUID;

/**
 * @author lxl
 * @date 2020/8/12 18:06
 */
public class TestCT2 {

private static String url =  "http://restapi.dituhui.com/v1/geocoding/geo";

public static void main(String args[]){
    String address = "山东省青岛市崂山区中韩街道海尔路1号海尔工业园s座";
    //String address = "江西省抚州市资溪县林肥厂附近";
    //String address = "北京市北京市朝阳区小红门乡";
    String id = UUID.randomUUID().toString();//生成随机数的区域id
    String param = "{\"id\":\"" + id + "\",\"address\":\"" + address.replace(" ", "") + "\"}";
    String addresses = URLEncoder.encode(param);//url中有汉字或特殊字符(非字母和数字的字符)，实现 转码

    String result1= HttpUtil.post(url+ "?addresses=[" + addresses + "]&need_district=true&ak=0c9c086be89944a0b2c8ebfb74e282a5", (String) null);



    //System.out.println(result1.replaceAll("\"results\"","\"values\""));


    result1 = result1.replaceAll("\"result\"","\"values\"");

    JSONObject responseJson = (JSONObject) JSONObject.parse(result1);

    JSONArray jsonArray = (JSONArray) responseJson.get("values");
    JSONObject addressObject = (JSONObject) jsonArray.get(0);

    System.out.println((String) addressObject.get("acode")+"--"+(String)addressObject.get("regionBlockCode")+"----"+(String)addressObject.get("areaName")+"----"+(String)addressObject.get("admincode"));


}

}
