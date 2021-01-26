package org.example;

import cn.hutool.core.date.DateUtil;
import cn.hutool.crypto.SecureUtil;

public class Md5Test {

    public static void main(String args[]){




        System.out.println( SecureUtil.md5("DeV80jP6K17RpFlAYgt25utIVDT8H3Lf"+"nCJvUI9DqF8i5fVx"+"1610601241194"));

        System.out.println( SecureUtil.md5("nCJvUI9DqF8i5fVx"+"DeV80jP6K17RpFlAYgt25utIVDT8H3Lf"+"1610523149711"));

        long nowTimeStr = System.currentTimeMillis();
        long timeStampStr = Long.parseLong("1600324652606");

        System.out.println(nowTimeStr-timeStampStr);


    }
}
