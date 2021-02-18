package org.example.java8;

import java.util.Arrays;
import java.util.List;

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

    }
}
