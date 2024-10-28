package com.esoftclass;

import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        var student1 = new Student("Nufair", 25, "E22345");
        student1.displayStudentDetails();

        var calculator = new Calculator();
        calculator.add(3, 5);

        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();
        cat.sound();

        var person1 = new Person();
        person1.setAge(23);
        person1.setType("Person");
        person1.setName("John");
        System.out.println(person1);

        var car1 = new Car("Audi", 2019);
        car1.start();
        car1.fuelUp();
        car1.drive();
        car1.stop();

        var bike1=  new Bike("Yamaha", 2005);
        bike1.start();
        bike1.fuelUp();

        var classInstance = new D();
        classInstance.display();


        // here, although NumberFormat can't be created instantly, its subclasses can be created and sent in the place of NumberFormat.
        System.out.println(NumberFormat.getCurrencyInstance().getClass());


        int[] numbers = {2, 3, 6};
        System.out.println(numbers[2]);

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Nufair");
        arrayList.add("Banana");
        arrayList.add("Apple");
//        System.out.println(arrayList.get(5));

        Map< Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "App");
        hashMap.put(2, "Flutter");
        System.out.println(hashMap.get(2));

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        System.out.println(list.get(1));



    }
}
