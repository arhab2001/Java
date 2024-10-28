package com.esoftclass;

public interface C extends A{
    @Override
    default void display(){
        System.out.println("Displaying from C");
    }
}
