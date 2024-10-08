package esoftclass;

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
    }
}
