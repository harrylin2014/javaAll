package org.example;

import cn.hutool.core.date.DateUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * @author lxl
 * @date 2020/8/4 11:36
 */
public class TestZS {
    public static void main(String args[]){

        System.out.println( StringUtils.contains("picture/202010291048037164058.HEI",".HEIC"));




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
