package com.company.search.array;

import java.util.Comparator;

public class BrandModelComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        int result = o1.getBrand().compareTo(o2.getBrand());

        if (result == 0) {
            result = o1.getModel().compareTo(o2.getModel());
        }

        return result;
    }
}
