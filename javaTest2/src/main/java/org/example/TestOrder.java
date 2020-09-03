package org.example;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.net.URLEncoder;
import java.util.UUID;

/**
 * @author lxl
 * @date 2020/8/12 18:06
 */
public class TestOrder {

private static String url =  "http://10.138.225.240:10163/work_order/get_order_infos?condition={\"equalJson\":{\"statuscode\":\"1\",\"statecode\":\"0\",\"hsicrm_serialnumber\":\"GA0SZU005003UL6J1105\",\"hsicrm_actualservicetypecode\":\"T02\"}}";

public static void main(String args[]){

    JSONObject jsonObject = new JSONObject();
    jsonObject.put("statuscode","1");
    jsonObject.put("statecode","0");
    jsonObject.put("hsicrm_serialnumber","GA0SZU005003UL6J1105");
    jsonObject.put("hsicrm_actualservicetypecode","T02");
    JSONObject jo = new JSONObject();
    jo.put("equalJson",jsonObject);

    System.out.println(jo.toJSONString());


    //String geturl = url.replace("\"", "%22").replace("{", "%7B").replace("}", "%7D");
    //String geturl = "http://10.138.225.240:10163/work_order/get_order_infos?condition=%7B%22equalJson%22:%7B%22statuscode%22:%221%22,%22statecode%22:%220%22,%22hsicrm_serialnumber%22:%22GA0SZU005003UL6J1105%22,%22hsicrm_actualservicetypecode%22:%22T02%22%7D%7D";
    String geturl = "http://10.138.225.240:10163/work_order/get_order_infos?condition="+jo.toJSONString();
    String result1= HttpUtil.get(geturl);

    System.out.println(geturl);
    System.out.println(result1);

}

}
