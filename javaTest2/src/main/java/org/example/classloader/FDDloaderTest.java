package org.example.classloader;

/**
 * @author lxl
 * @date 2020/9/3 10:15
 */

public class FDDloaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = FDD.class.getClassLoader();

    System.out.println(loader.getResource(""));
    //一、 使用ClassLoader.loadClass()来加载类，不会执行初始化块
        loader.loadClass("org.example.classloader.FDD");
    //loader.loadClass(loader.getResource("")+"org/example/classloader/FDD");
    // 二、 使用Class.forName()来加载类，默认会执行初始化块
    Class.forName("org.example.classloader.FDD");
    // 三、使用Class.forName()来加载类，指定ClassLoader，初始化时不执行静态块
    Class.forName("org.example.classloader.FDD", false, loader);
        }
}
