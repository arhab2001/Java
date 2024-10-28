package com.esoftclass;

public interface B extends A{
    @Override
    default void display(){
        System.out.println("Displaying from B");
    }
}
