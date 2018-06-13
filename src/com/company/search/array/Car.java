package com.company.search.array;

public class Car implements Comparable<Car> {
    private Integer year;
    private String brand;
    private String model;
    private Integer price;

    public Car(Integer year, String brand, String model, Integer price) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        return this.year.compareTo(o.getYear());
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {

        return String.format("Brand: %s | Model: %s | Year: %s | Price: %s",
                this.brand,
                this.model,
                this.year,
                this.price);
//        return "Brand: " +
//                this.brand + " | Model: " + this.model +
//                " | Year: "
//                + this.year;
    }
}
