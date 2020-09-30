package org.example;

import cn.hutool.core.date.DateUtil;
import cn.hutool.crypto.SecureUtil;

public class Md5Test {

    public static void main(String args[]){




        System.out.println( SecureUtil.md5("DeV80jP6K17RpFlAYgt25utIVDT8H3Lf"+"nCJvUI9DqF8i5fVx"+"1600324652606"));

        System.out.println( SecureUtil.md5("urC7W4tOOxBQrB7O"+"Jq$mdd!$H3PpI#Q4dO@x&ODa578KARnf"+"1600324652606"));

        long nowTimeStr = System.currentTimeMillis();
        long timeStampStr = Long.parseLong("1600324652606");

        System.out.println(nowTimeStr-timeStampStr);


    }
}
