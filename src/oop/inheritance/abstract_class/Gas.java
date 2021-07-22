package oop.inheritance.abstract_class;

public class Gas extends Car{

    public void drive(){
        System.out.println("Drives on gasoline!");
    }

    public Gas(String color, String engine, long mileage, int doors) {
        super(color, engine, mileage, doors);
    }
}
