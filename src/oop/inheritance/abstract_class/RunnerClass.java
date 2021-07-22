package oop.inheritance.abstract_class;

public class RunnerClass {

    public static void main(String[] args) {

        // Abstract classes cannot be instantiated directly
        // We are instantiating an instance of Gas class but it's data type is Car [abstract class]
        Car car1 = new Gas("Yellow", "4.6L", 123000, 2);

    }
}
