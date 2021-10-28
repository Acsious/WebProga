package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Coupe> coupeList =new ArrayList<>();
        List<Sedan> sedanList =new ArrayList<>();

        Coupe Mustang = new Coupe();
        Mustang.name="Mustang";
        Mustang.color = "blue";
        Mustang.price = 50000;
        Mustang.mileage = 15000;
        Mustang.age = 5;
        Mustang.regNum="M8L8T";
        coupeList.add(Mustang);

        Coupe RX7 = new Coupe();
        RX7.name="RX7";
        RX7.color = "yellow";
        RX7.price = 25000;
        RX7.mileage = 60000;
        RX7.age = 19;
        RX7.regNum="AH1WR";
        coupeList.add(RX7);

        Coupe S5 = new Coupe();
        S5.name="S5";
        S5.color = "grey";
        S5.price = 85000;
        S5.mileage = 4000;
        S5.age = 1;
        S5.regNum="WJ88R";
        coupeList.add(S5);

        Sedan Rapid = new Sedan();
        Rapid.name="Rapid";
        Rapid.color = "white";
        Rapid.price = 7000;
        Rapid.mileage = 120000;
        Rapid.age = 7;
        Rapid.regNum="WP4WW";
        sedanList.add(Rapid);

        Sedan Phantom = new Sedan();
        Phantom.name="Phantom";
        Phantom.color = "silver";
        Phantom.price = 200000;
        Phantom.mileage = 10000;
        Phantom.age = 6;
        Phantom.regNum="NS8BM";
        sedanList.add(Phantom);

        Sedan Camry = new Sedan();
        Camry.name="Camry";
        Camry.color = "black";
        Camry.price = 16000;
        Camry.mileage = 32000;
        Camry.age = 2;
        Camry.regNum="BJ8KN";
        sedanList.add(Camry);

        System.out.print("Enter the preferred body type: ");
        String inputBody = input.nextLine();

        if (inputBody.equals("Coupe")) {
            boolean found=false;
            System.out.print("Enter searching registration number: ");
            String inputNum = input.nextLine();
            for (Coupe coupe : coupeList) {
                if (coupe.regNum.equals(inputNum)){
                    found=true;
                    coupe.GoToAnotherCity();
                    coupe.GetIntoCrash();
                    coupe.PaintCar("purple");
                    System.out.print(coupe.name + " ");
                    coupe.DisplayCarInfo();
                }
            }
            if (!found){
                System.out.println("Coupe with this number does not exist");
            }

            System.out.print("Coupe info: ");
            for (Coupe coupe : coupeList) {
                System.out.print(coupe.name + " ");
            }

            Collections.sort(coupeList, new CoupeSortByAge());
            System.out.print("\nCoupe sorted by age info: ");
            for (Coupe coupe : coupeList) {
                System.out.print(coupe.name + " ");
            }

            Collections.sort(coupeList, new CoupeSortByPrice());
            System.out.print("\nCheapest coupe is: ");
            System.out.println(coupeList.get(0).name);

            Collections.sort(coupeList, new CoupeSortByMileage());
            int ageCompare=0;
            for (int i = coupeList.size()-1; i > 0; i--) {
                if(coupeList.get(i).age>3) {
                    System.out.println(coupeList.get(i).name + " elder than 3 years, and have highest mileage: " + coupeList.get(i).mileage);
                    ageCompare=1;
                    break;
                }
            }
            if (ageCompare==0){
                System.out.println("Coupe elder then 3 years does not exist");
            }
        }
        else if(inputBody.equals("Sedan")){
            boolean found=false;
            System.out.print("Enter searching registration number: ");
            String inputNum = input.nextLine();
            for (Sedan sedan : sedanList) {
                if (sedan.regNum.equals(inputNum)){
                    found=true;
                    sedan.GoToAnotherCity();
                    sedan.GetIntoCrash();
                    sedan.PaintCar("red");
                    System.out.print(sedan.name + " ");
                    sedan.DisplayCarInfo();
                }
            }
            if (!found){
                System.out.println("Sedan with this number does not exist");
            }

            System.out.print("Sedan info: ");
            for (Sedan sedan : sedanList) {
                System.out.print(sedan.name + " ");
            }

            Collections.sort(sedanList, new SedanSortByAge());
            System.out.print("\nSedan sorted by age info: ");
            for (Sedan sedan : sedanList) {
                System.out.print(sedan.name + " ");
            }

            Collections.sort(sedanList, new SedanSortByPrice());
            System.out.print("\nCheapest sedan is: ");
            System.out.println(sedanList.get(0).name);

            Collections.sort(sedanList, new SedanSortByMileage());
            int ageCompare=0;
            for (int i = sedanList.size()-1; i > 0; i--) {
                if(sedanList.get(i).age>3) {
                    System.out.println(sedanList.get(i).name + " elder than 3 years, and have highest mileage: " + sedanList.get(i).mileage);
                    ageCompare=1;
                    break;
                }
            }
            if (ageCompare==0){
                System.out.println("Sedan elder then 3 years does not exist");
            }
        }
        else{
            System.out.println("Entered incorrect body type");
        }
    }
}


