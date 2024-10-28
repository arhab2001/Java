package com.esoftclass.tutorial;

public class Car extends Vehicle implements FuelEfficiency{
    public Car(int speed, int fuel){
        super(speed, fuel);
    }

    @Override
    public void displayVehicleInfo(){
        System.out.println("Vehicle Info: " + "Speed: " + getSpeed() + "km/h Fuel: " + getFuel());
    }

    @Override
    public double calculateFuelEfficiency(){
        return Math.ceil(Math.random() * getFuel());
    }
}
