package com.esoftclass;

public class Person {
    private String name;
    private int age;
    private String type;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(){

    }
    public void displayStudentDetails() {
        System.out.println("My Name is "  + this.name + " and my age is " + this.age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
}
