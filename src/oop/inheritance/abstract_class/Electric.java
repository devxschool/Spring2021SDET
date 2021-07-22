package oop.inheritance.abstract_class;

public class Electric extends Car{

    public Electric(String color, String engine, long mileage, int doors) {
        super(color, engine, mileage, doors);
    }

    @Override
    public void drive(){
        System.out.println("Moved by the power of electrical batteries!");

    }
}
