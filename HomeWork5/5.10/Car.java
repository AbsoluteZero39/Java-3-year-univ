package com.company;

public class Car implements Comparable<Car> {
    public final String model;
    public final double carPrice;
    public final int maxSpeed;
    public final int fuelUsage;

    public Car(String model,double price, int maxSpeed, int fuel){
        this.model = model;
        this.carPrice = price;
        this.maxSpeed = maxSpeed;
        this.fuelUsage = fuel;
    }
    @Override
    public int compareTo(Car o) {
            return this.fuelUsage- o.fuelUsage;
    }
}
