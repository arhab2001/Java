package com.esoftclass;

public class Bike extends Vehicle {
    public Bike(String model, int year){
        super(model, year);
    }

    @Override
    public void fuelUp(){
        System.out.println("The bike is fuelling up with petrol...");
    }
}
