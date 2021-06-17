package org.example;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lxl
 * @date 2021/4/29 17:55
 */
public class MapTest {
    public static void main(String[] args) {
        List<Map> list = new ArrayList<>();
        List<Map> list2 = new ArrayList<>();

        for(int j=0;j<10;j++){
            Map map =new HashMap();
            map.put("a",j+"");
            map.put("b","1");
            list.add(map);
        }
        for(int i=0;i<10;i++){
            Map map = list.get(i);
            list2.add(map);
        }

        for(int m = 0;m<10;m++){
            Map map = list2.get(m);
            System.out.println(map.get("a"));
            System.out.println(map.get("b"));
        }
    }
}
