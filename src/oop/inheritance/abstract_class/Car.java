package oop.inheritance.abstract_class;

public abstract class Car extends Vehicle{

    // An abstract class that's extending another abstract class
    // is not required to implement all the abstract methods of the parent
    // class, rather it can pass it along to the other classes which are
    // extending the current class or it has an option to implement them

    public Car(String color, String engine, long mileage, int doors) {
        super(color, engine, mileage, doors);
    }

    public void openDoor(){
        System.out.println("Car door opened.");
    }
}
