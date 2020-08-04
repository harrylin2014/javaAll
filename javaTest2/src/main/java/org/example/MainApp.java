package org.example;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUtil;
import org.apache.camel.main.Main;

import java.util.Calendar;
import java.util.Date;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {

        String serviceDate = "";
        String serviceTime = "";


        Date date = new Date();

        String startTime = DateUtil.format(date, "yyyy-MM-dd 09:00:00");
        String endTime = DateUtil.format(date, "yyyy-MM-dd 18:00:00");

        String now = DateUtil.format(date, "yyyy-MM-dd HH:00:00");

        String now2= DateUtil.format(DateUtil.offset(date, DateField.HOUR_OF_DAY, 2),"yyyy-MM-dd HH:00:00");
        String now3= DateUtil.format(DateUtil.offset(date, DateField.HOUR_OF_DAY, 3),"yyyy-MM-dd HH:00:00");

        boolean isNowTrue = DateUtil.parse(now).getTime() >DateUtil.parse(startTime).getTime() && DateUtil.parse(now).getTime() < DateUtil.parse(endTime).getTime();

        boolean isNow2True = DateUtil.parse(now2).getTime() >DateUtil.parse(startTime).getTime() && DateUtil.parse(now2).getTime() < DateUtil.parse(endTime).getTime();

        boolean isNow3True = DateUtil.parse(now3).getTime() >DateUtil.parse(startTime).getTime() && DateUtil.parse(now3).getTime() < DateUtil.parse(endTime).getTime();

        if(isNowTrue && isNow2True && isNow3True){
            serviceDate = now2;
            serviceTime = now2.substring(now2.indexOf(" ")+1,now2.length())+"-"+now3.substring(now3.indexOf(" ")+1,now3.length());
        }else{
            Date endOfDay = DateUtil.endOfDay(date);
            String start = DateUtil.format(date, "yyyy-MM-dd 00:00:00");
            String end = DateUtil.format(date, "yyyy-MM-dd 09:00:00");

            if( date.getTime() >= DateUtil.parse(start).getTime() && DateUtil.parse(end).getTime() >date.getTime() ){
                 serviceDate = DateUtil.format(date, "yyyy-MM-dd 09:00:00");
                 serviceTime = "09:00:00-10:00:00";
            }else{
                serviceDate = DateUtil.format(DateUtil.offset(date, DateField.DAY_OF_MONTH, 1),"yyyy-MM-dd 09:00:00");
                serviceTime = "09:00:00-10:00:00";
            }

        }


        System.out.println(serviceDate+"---"+serviceTime);
    }

}

