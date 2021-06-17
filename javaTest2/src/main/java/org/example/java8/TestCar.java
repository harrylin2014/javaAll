package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author lxl
 * @date 2021/2/1 18:38
 */
public class TestCar {
    public static void main(String[] args) {

        final CarTest car = CarTest.create( CarTest::new );
        final List<CarTest> cars = Arrays.asList(car);

        cars.forEach(CarTest::collide);

        cars.forEach(CarTest::repair);

        final CarTest police = CarTest.create(CarTest::new);
        cars.forEach(police::follow);

        //匿名内部类
        Supplier sp = new Supplier<CarTest>(){

            @Override
            public CarTest get() {
                return new CarTest();
            }
        };

        Supplier sp2 = ()->  {return new CarTest();};

        System.out.println(sp2.get());

    }
}
