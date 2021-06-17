package com.example.webdemo.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lxl
 * @date 2021/5/28 11:16
 */
public class TestJava {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setLxl(Object o) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
         Method set = o.getClass().getMethod("setName",String.class);
         set.invoke(o,"lyl");
    }
}
