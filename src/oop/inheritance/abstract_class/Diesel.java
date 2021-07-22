package oop.inheritance.abstract_class;

public class Diesel extends Car{

    public void drive(){
        System.out.println("Drives on diesel!");
    }

    public Diesel(String color, String engine, long mileage, int doors) {
        super(color, engine, mileage, doors);
    }
}
