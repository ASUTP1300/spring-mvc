package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Service  {

    private static final List<Car> cars;

    static {
        Car car1 = new Car("Mercedes", 124, 3.0);
        Car car2 = new Car("Mercedes", 210, 2.0);
        Car car3 = new Car("Toyota", 70, 3.5);
        Car car4 = new Car("BMW", 525, 2.5);
        Car car5 = new Car("Skoda", 9, 2.2);
        cars = (Arrays.asList(car1, car2, car3, car4, car5));
    }

    public static List<Car> getCar(int n) {
        ArrayList<Car> carsCopy = new ArrayList<>(cars);
        return  carsCopy.subList(0, n);
    }
}

