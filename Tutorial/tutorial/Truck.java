package com.esoftclass.tutorial;

public class Truck extends Vehicle implements FuelEfficiency{

    private float loadCapacity;
    public Truck(int speed, int fuel, float loadCapacity){
        super(speed, fuel);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayVehicleInfo(){
        System.out.println("Vehicle Info: " + "Speed: " + getSpeed() + "km/h Fuel: " + getFuel() + " Load Capacity: " + getLoadCapacity() );
    }

    @Override
    public double calculateFuelEfficiency(){
        return  Math.ceil(Math.random() * getFuel());
    }

    public float getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(float loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
