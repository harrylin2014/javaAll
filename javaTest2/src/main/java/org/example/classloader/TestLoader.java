package org.example.classloader;

/**
 * @author lxl
 * @date 2020/9/3 10:04
 */
public class TestLoader {

    public static void main(String args[]){

        //系统加载器，或者应用加载器
        System.out.println(Thread.currentThread().getContextClassLoader());

        //系统加载器，或者应用加载器
        System.out.println(ClassLoader.getSystemClassLoader());

        //系统加载器，或者应用加载器
        System.out.println(TestLoader.class.getClassLoader());

        //扩展加载器
        System.out.println(TestLoader.class.getClassLoader().getParent());

        //因为bootstrap类加载器是用c语言写的，所以javaa里面显示不出来
        System.out.println(Thread.currentThread().getContextClassLoader().getParent().getParent());


    }

}
