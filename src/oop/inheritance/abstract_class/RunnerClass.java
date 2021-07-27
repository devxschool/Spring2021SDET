package oop.inheritance.abstract_class;

public class RunnerClass {

    public static void main(String[] args) {

        // Abstract classes cannot be instantiated directly
        // We are instantiating an instance of Electric class but it's data type is Car [abstract class]
        Car car1 = new Electric("Yellow", "4.6L", 123000, 2, 250);
        car1.drive();

    }
}
