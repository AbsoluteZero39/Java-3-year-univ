package com.company;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxoPark {
    private Car[] cars;
    public TaxoPark(Car[] cars) {
        this.cars = cars;
    }
    public double countPrice(){
        double price = 0;
        for(Car car:this.cars){
            price+=car.carPrice;
        }
        return price;
    }
    public Car[] findCar(int speed){
        List<Car> foundCars = new ArrayList<Car>();
        for(Car car:this.cars){
            if(car.maxSpeed<=speed) foundCars.add(car);
        }
        Car[] arr = new Car[foundCars.size()];
        return foundCars.toArray(arr);

    }
    public Car[] sortCars(){
        Arrays.sort(this.cars,Car::compareTo);
        return this.cars;
    }
    static void showCars(Car[] cars){
        for(Car car:cars){
            out.println("Model: "+car.model+" Carprice: "+car.carPrice+" maxSpeed: "+car.maxSpeed+" fuelUsage: "+car.fuelUsage);
        }
    }
}
