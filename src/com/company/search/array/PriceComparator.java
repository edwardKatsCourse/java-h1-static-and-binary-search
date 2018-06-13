package com.company.search.array;

import java.util.Comparator;

public class PriceComparator implements Comparator<Car> {

    /**
     * object 1 -> object 2 = 0..100
     * object 2 -> object 1 = 100..0
     */

    @Override
    public int compare(Car object1, Car object2) {
        return object2.getPrice().compareTo(object1.getPrice());
    }
}
