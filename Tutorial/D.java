package com.esoftclass;
public class D implements B,C{
    @Override
    public void display(){
        B.super.display();
        C.super.display();
    }
}
