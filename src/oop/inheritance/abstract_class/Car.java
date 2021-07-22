package oop.inheritance.abstract_class;

public abstract class Car {

    private String color;
    private String engine;
    private long mileage;
    private int doors;

    public abstract void drive();

    public Car(String color, String engine, long mileage, int doors) {
        this.color = color;
        this.engine = engine;
        this.mileage = mileage;
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
