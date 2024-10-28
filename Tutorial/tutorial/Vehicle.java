// it declares java that classes in the current file belong to a particular package. so, it is needed to declare this.
// it should be declared corresponding to file path name. if a file is in default package, it is not need to be named.
package com.esoftclass.tutorial;

public abstract class Vehicle {
    private int speed;
    private int fuel;

    public Vehicle(int speed, int fuel){
        this.fuel = fuel;
        this.speed = speed;
    }

    public abstract void displayVehicleInfo();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
