package com.company.search.array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Андрей
        //19

        //Андрей
        //36
        //Женат

        //Андрей
        //36
        //Не женат

        //Андрей
        //37

        //Борис


        //Comparator -> когда сортировка НЕ по умолчанию, либо
        //  нету доступа к исходному коду
        //Comparable -> сортировка по умолчанию,
        //  и когда у нас есть доступ к исходному коду

        Car car_1 = new Car(2000, "Seat", "Ibiza", 1000);
        Car car_2 = new Car(2001, "Opel", "Astra", 900);
        Car car_3 = new Car(2003, "Opel", "Omega", 1100);


        Car[] cars = {car_3, car_1, car_2};

//        Car c4 = new Car(2002, "Citroen", "C4");
//
//        Arrays.sort(cars);

//        System.out.println(Arrays.binarySearch(cars, c4));

        Arrays.sort(cars, new PriceComparator()); //Sort by year (Car has Comparable, comparing by year)
//        Arrays.sort(cars, new BrandModelComparator()); //Sort by brand and model

        for (Car car : cars) {
            System.out.println(car);
        }

        Car car_4 = new Car(1999, "Opel", "Corsa", 500);
        System.out.println(Arrays.binarySearch(cars, car_4));

    }

    private static void plainStrings() {
        //                     0    1    2    3    4  (-6 -1 = -5 -> 5)
//        String [] alphabet = {"a", "a", "b", "c", "d" /*"e"*/  };
        String[] alphabet = {"a", "b", "c", "d", "e", "g", "h"};

        String letter = "i";

        System.out.println(Arrays.binarySearch(alphabet, letter));

    }
}
