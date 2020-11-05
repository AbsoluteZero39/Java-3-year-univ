package com.company;
import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {
	Car cars[] = new Car[5];
	cars[0] = new Car("Vedro1",300,90,20);
	cars[1] = new Car("Vedro2",3500,70,10);
	cars[2] = new Car("Vedro3",35400,150,15);
	cars[3] = new Car("Vedro4",31200,80,8);
	cars[4] = new Car("Vedro5",31200,190,13);
    TaxoPark taxopark1 = new TaxoPark(cars);
	out.println("taxopark price "+ taxopark1.countPrice());
	out.println("FounrCars------------------------");
	TaxoPark.showCars(taxopark1.findCar(120));
	out.println("Sorted------------------------");
	TaxoPark.showCars(taxopark1.sortCars());
}
}
