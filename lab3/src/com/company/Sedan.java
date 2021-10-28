package com.company;

import java.util.Comparator;

/**
 * Car`s daughter class (Sedan car have 4 doors)
 */
public class Sedan extends Car {
    final int cntDoors = 4;

    /**
     * Shows all information about car
     */

    public void DisplayCarInfo() {
        System.out.println("\nNumber of doors: " + this.cntDoors + "\nPrice: " + this.price + "\nAge: " + this.age +
                "\nMileage: " + this.mileage + "\nColor: " + this.color + "\nRegistration Number: " + this.regNum +"\n");
    }
}
class SedanSortByAge implements Comparator<Sedan> {
    public int compare(Sedan a, Sedan b) {
        return a.age - b.age;
    }
}

class SedanSortByPrice implements Comparator<Sedan> {
    public int compare(Sedan a, Sedan b) {
        return a.price - b.price;
    }
}

class SedanSortByMileage implements Comparator<Sedan> {
    public int compare(Sedan a, Sedan b) { return a.mileage - b.mileage; }
}

