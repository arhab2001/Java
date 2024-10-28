package com.esoftclass;

    // interface declaring contract for drivable behaviour.
public interface Drivable {

    // implicitly public and abstract method.
    void drive();

    // after java 8, can use default methods to provide common behaviour.
    default void stop() {
        applyingBrakes();
        System.out.println("Vehicle is stopping.");
    }

    private void applyingBrakes(){
        System.out.println("Applying brakes...");
    }
}
