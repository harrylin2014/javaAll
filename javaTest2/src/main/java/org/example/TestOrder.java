package org.example;

import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author lxl
 * @date 2020/8/12 18:06
 */
public class TestOrder {


    static List<String> keyWord=new ArrayList<String>();
    static {
        keyWord.add("您已经成功接入客服系统。");
        keyWord.add("每次限输入一个数字序号");
        keyWord.add("输入数字号选择相应问题");
        keyWord.add("小海提示");
        keyWord.add("提示");
        keyWord.add("一次只能选择一个序号");
    }

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




    //String tr = "请输入数字号选择您要咨询的问题（一次只能选择一个序号）： 1. 滚筒洗衣机门上的观察窗漏水了 2. 滚筒洗衣机右下角过滤器处漏水 3. 滚筒洗衣机放洗涤剂处漏水 4. 滚筒洗衣机水龙头和进水管接头处漏水 5. 滚筒洗衣机进水管和洗衣机连接的地方漏水怎么办 \n<a href=\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx7d3377afc607dcae&amp;redirect_uri=http://hicweixin.haier.net/hs/h/req/req_repair.html?selected=0&amp;response_type=code&amp;scope=snsapi_base&amp;state=STATE#wechat_redirect\">如其他部位漏水擦拭仍有水，请点此预约售后服务上门检查</a>";
    //String tr = "请输入数字号选择相应产品： 1. 滚筒各部位漏水解决方法 2. 波轮各部位漏水解决方法 \n<a href=\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx7d3377afc607dcae&amp;redirect_uri=http://hicweixin.haier.net/hs/h/req/req_repair.html?selected=0&amp;response_type=code&amp;scope=snsapi_base&amp;state=STATE#wechat_redirect\">如需上门服务，请点此预约售后</a>";

    String tr = "请输入数字号选择相应问题： 1. 滚筒脱水常见问题解决办法 2. 波轮脱水常见问题解决办法 3. 双桶洗衣机脱水常见故障解决办法 \n<a href=\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx7d3377afc607dcae&amp;redirect_uri=http://hicweixin.haier.net/hs/h/req/req_repair.html?selected=0&amp;response_type=code&amp;scope=snsapi_base&amp;state=STATE#wechat_redirect\">如需上门，点此预约售后服务，工作人员会及时与您联系。</a>如选项中没有请输入产品及故障。";

    for (String key:keyWord) {
        if(tr.indexOf(key)!=-1){
            System.out.println("进来了");
        }
    }

}

}
