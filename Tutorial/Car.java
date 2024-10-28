package com.esoftclass;

public class Car extends Vehicle implements Drivable{
    public Car(String model, int year){
        super(model, year);
    }

    @Override
    public void drive(){
        System.out.println("The car is driving.");
    }

    @Override
    public void fuelUp(){
        System.out.println("The car is fuelling up.");
    }
}
