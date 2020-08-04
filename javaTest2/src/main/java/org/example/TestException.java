package org.example;

public class TestException {

    public static void main(String args[]){
           System.out.println(geti()+"");

    }

    public static int geti(){
        try{
            int i = 1/0;
        }catch (Exception e){
            e.printStackTrace();
        }
       return 2;
    }
}
