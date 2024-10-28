package com.esoftclass;

import java.text.NumberFormat;

public abstract class Vehicle {
    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public abstract void fuelUp();

    public void start(){
        System.out.println("Vehicle is starting.");
    }
}
