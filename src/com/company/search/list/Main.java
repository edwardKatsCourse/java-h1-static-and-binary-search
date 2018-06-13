package com.company.search.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car car_1 = new Car(2000, "Seat", "Ibiza", 1000);
        Car car_2 = new Car(2001, "Opel", "Astra", 900);
        Car car_3 = new Car(2003, "Opel", "Omega", 1100);

        List<Car> cars = new ArrayList<>();
        cars.add(car_1);
        cars.add(car_2);
        cars.add(car_3);
//        cars.add(car_4);


        Collections.sort(cars, new PriceComparator());
        for (Car car : cars) {
            System.out.println(car);
        }

        Car car_4 = new Car(1999, "Opel", "Corsa", 500);
        int i = Collections.binarySearch(cars, car_4, new BrandModelComparator());
        System.out.println(i);
    }
}
