package org.example;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lxl
 * @date 2021/4/8 15:50
 */
public class TestNew {
    public static void main(String[] args) {
        String a = "0.0";
        BigDecimal c = new BigDecimal(a);
        BigDecimal b = new BigDecimal(0.0);
        System.out.println(c.setScale( 0, BigDecimal.ROUND_DOWN ).equals(BigDecimal.ZERO));
        TestA testA = new TestA();

        System.out.println("csd:"+testA.getA());

        String doubletest1 = "1.2233444";
        Double doubletest2 = Double.parseDouble(doubletest1);
        System.out.println(doubletest2);

        String currentTime = DateUtil.getNowTime("yyyy-MM-dd HH:mm:ss");

        boolean begin = DateUtil.compareDateTime(currentTime,"2020-12-01 00:00:00");
        boolean end = DateUtil.compareDateTime("2020-12-31 23:59:59",currentTime);
        if(!begin && !end){
            System.out.println("false");
        }


    }


}
