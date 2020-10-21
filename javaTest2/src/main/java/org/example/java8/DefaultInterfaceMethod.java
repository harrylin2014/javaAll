package org.example.java8;

/**
 * @author lxl
 * @date 2020/10/12 12:31
 */

/**
 * 一个接口有默认方法，考虑这样的情况，一个类实现了多个接口，且这些接口有相同的默认方法，以下实例说明了这种情况的解决方法：
 *
 * 一个解决方案是创建自己的默认方法，来覆盖重写接口的默认方法：
 *
 * 第二种解决方案可以使用 super 来调用指定接口的默认方法：
 */
public class DefaultInterfaceMethod {

    public static void main(String args[]){
        Vehicle vehicle = new Car();
        vehicle.print();
    }
}

interface Vehicle {
    default void print(){
        System.out.println("我是一辆车!");
    }

    static void blowHorn(){
        System.out.println("按喇叭!!!");
    }
}

interface FourWheeler {
    default void print(){
        System.out.println("我是一辆四轮车!");
    }
}

class Car implements Vehicle, FourWheeler {
    public void print(){
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("我是一辆汽车!");
    }
}
