package com.company;

/**
 * Parent`s car class
 */
public abstract class Car  {
    int price;
    String color = "grey";
    String name;
    int age;
    int mileage;
    String regNum;

    /**
     * Mileage increases, and the cost decreases
     * @return Actual mileage
     */
    public int GoToAnotherCity(){
        mileage+=200;
        price-=2;
        return mileage;
    }

    /**
     * The cost of the car has decreased
     * @return Actual price
     */
    public int GetIntoCrash(){
        price-=400;
        return price;
    }

    /**
     * Repainting the car
     * @param newColor New vehicle color
     * @return Actual color
     */
    public String PaintCar(String newColor){
        color = newColor;
        price+=100;
        return color;
    }
}
