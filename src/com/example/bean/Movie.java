package com.example.bean;


public class Movie {
    String name;
    Price price;
    int days;

    int frequentRentPoint;
    public String getName() {
        return name;
    }
    public Movie(String name, int days, Price price) {
        this.name = name;
        this.price = price;
        this.days = days;
        this.setFrequentRentPoint(price.getFrequentRenterPoints(days));

    }
    public int getFrequentRentPoint() {
        return frequentRentPoint;
    }

    public void setFrequentRentPoint(int frequentRentPoint) {
        this.frequentRentPoint = frequentRentPoint;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", charge=" + price.getCharge(days) +
                ", frequentRentPoint=" + frequentRentPoint +
                '}';
    }

    public double getCharge() {
        return price.getCharge(days);
    }
}
 