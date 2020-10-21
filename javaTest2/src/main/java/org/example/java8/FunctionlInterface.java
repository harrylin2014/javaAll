package org.example.java8;

/**
 * @author lxl
 * @date 2020/10/12 11:48
 */

/**
 * 函数式接口
 */
public class FunctionlInterface {

    interface GreetingService
    {
        void sayMessage(String message);
    }

    public static void main(String[] args) {

        GreetingService greetService1 = message -> System.out.println("Hello " + message);
        greetService1.sayMessage("ok呀");
    }

}
