package org.example.java8;

import java.util.function.Supplier;

/**
 * @author lxl
 * @date 2021/2/1 18:38
 */
public class CarTest {
    //Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static CarTest create(final Supplier<CarTest> supplier) {
        return supplier.get();
    }

    public static void collide(final CarTest car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final CarTest another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }

}
