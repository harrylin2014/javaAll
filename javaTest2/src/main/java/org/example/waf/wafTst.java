package org.example.waf;

import cn.hutool.http.HttpUtil;

/**
 * @author lxl
 * @date 2020/11/23 10:42
 */
public class wafTst {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        for(int i=0;i<201;i++){
            HttpUtil.get("https://abcdservice.abcd.net/entranceapi/version/getCurrVer");
        }

        System.out.println(System.currentTimeMillis());
    }
}
