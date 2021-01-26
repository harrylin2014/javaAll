package org.example;

import cn.hutool.core.lang.Assert;

import java.sql.SQLOutput;

public class TestException {

    public static void main(String args[]){

        //Assert.notNull(null,"no null object");

           System.out.println(geti()+"");

    }

    public static int geti(){
        try{
            int i = 1/0;
        }catch (Exception e){

            System.out.println(e.getCause());
            System.out.println("----------------------");
            e.printStackTrace();
        }
       return 2;
    }
}
