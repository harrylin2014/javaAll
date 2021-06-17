package com.example.webdemo.main;

import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lxl
 * @date 2020/12/17 16:33
 */
public class TestJsonMain {

    public static void main(String[] args) {
        
        try{
            int i = 1/0;
            int a = 1;
            if(a == 1){
                int b = 2;
                System.out.println(b);
            }else if(a == 2){
                int b = 3;
                System.out.println(b);
            }

            long currentTime = new Date().getTime() ;
            currentTime +=30*60*1000;
            Date date=new Date(currentTime);
            SimpleDateFormat dateFormat = new SimpleDateFormat(
                    "yyyy-MM-dd HH:mm:ss");
            System.out.println(dateFormat.format(date));


            String cc = "120.4444900173611";
            System.out.println(Double.parseDouble(cc));

            String aa = "法人不一致的情况";
            System.out.println(aa.contains("法人不一致的情况"));


            String sign = SecureUtil.md5("token=4eb3faa7432641ddb1f1b3ae0bdad042&key=45859add-ca9d-4731-b3d0-3023516be612");

            System.out.println(sign);

            System.out.println(0%4000);
            System.out.println(1%4000);

            Map map = new HashMap();
            map.put("id",1);
            map.put("riqi",new Date());
            map.put("zifuchuan","zifuchuan");

            System.out.println(map.get("id")+":"+map.get("zifuchuan")+":"+map.get("riqi"));

            String json = JSON.toJSONString("success");

            System.out.println(json);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
