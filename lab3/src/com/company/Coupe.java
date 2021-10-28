package com.company;

import java.util.Comparator;

/**
 * Car`s daughter class (Coupe car have 2 doors)
 */
public class Coupe extends Car {
    final int cntDoors = 2;

    /**
     * Shows all information about car
     */
    public void DisplayCarInfo() {
        System.out.println("\nNumber of doors: " + this.cntDoors + "\nPrice: " + this.price + "\nAge: " + this.age +
                "\nMileage: " + this.mileage + "\nColor: " + this.color + "\nRegistration Number: " + this.regNum + "\n");
    }
}

class CoupeSortByAge implements Comparator<Coupe> {
    public int compare(Coupe a, Coupe b) {
        return a.age - b.age;
    }
}

class CoupeSortByPrice implements Comparator<Coupe> {
    public int compare(Coupe a, Coupe b) {
        return a.price - b.price;
    }
}

class CoupeSortByMileage implements Comparator<Coupe> {
    public int compare(Coupe a, Coupe b) { return a.mileage - b.mileage; }
}