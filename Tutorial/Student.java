package com.esoftclass;

public class Student extends Person{
    private String studentId;

//    substitution is polymorphism means an instance of a parent class can be taken place by any of the subclass instances.

    public Student(String name, int age, String studentId){
        super(name, age);
        this.studentId = studentId;
    }

//
    public void displayData(String subject, int marks){
        System.out.println(subject + ": " + marks);
    }

    public void displayData(int marks, String subject ){
        System.out.println(subject + ": " + marks);
    }


}
