package org.example.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * 方法引用
 * @author lxl
 * @date 2020/10/12 11:44
 */
public class java8methodInvoke {
    public static void main(String args[]){
        List<String> names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
    }
}
