package esoftclass;

public class Person {
    public String name;
    public int age;
    public String type;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayStudentDetails() {
        System.out.println("My Name is "  + this.name + " and my age is " + this.age);
    }
}
