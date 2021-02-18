package org.example;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.text.StrSpliter;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * @author lxl
 * @date 2020/8/4 11:36
 */
public class TestZS {
    public static void main(String args[]){


        String str1 = "1612586644413";

        LocalDateTime localDateTime = new Date(1535444725000L).toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime();

        //System.out.println(localDateTime.);

        //System.out.println( StringUtils.contains("picture/202010291048037164058.HEI",".HEIC"));
        String str = "整机延长至10年";

        int i = str.indexOf("年");
        String s = str.substring(0,i+1);
        String l = str.substring(i+1,str.length());

        System.out.println( s+"-"+l);





    }
    public static boolean isContains(String values, String value) {
        return values != null && values.length() != 0 ? isContains(Constants.COMMA_SPLIT_PATTERN.split(values), value) : false;
    }

    public static boolean isContains(String[] values, String value) {
        if (value != null && value.length() > 0 && values != null && values.length > 0) {
            String[] arr$ = values;
            int len$ = values.length;

            for(int i$ = 0; i$ < len$; ++i$) {
                String v = arr$[i$];
                if (value.equals(v)) {
                    return true;
                }
            }
        }

        return false;
    }
}
