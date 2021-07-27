package oop.inheritance.abstract_class;

public class Electric extends Car{

    // Electric class is a concrete class because it's non abstract class that extends the abstract class
    // and all concrete classes should implement abstract methods of the parent class [If it is abstract]

    // A concrete class is a class that has an implementation for all of its methods.
    // They cannot have any unimplemented methods.
    // It can also extend an abstract class or implement an interface as long
    // as it implements all their methods. It is a complete class and can be instantiated.

    private int batteryRange;

    public Electric(String color, String engine, long mileage, int doors, int batteryRange) {
        super(color, engine, mileage, doors);
        this.batteryRange = batteryRange;
    }


    public void drive(){
        System.out.println("Moved by the power of electrical batteries!");
    }

    public void print(){
        System.out.println("Print is from ELECTRIC class!");
    }

    public void setBatteryRange(int batteryRange){
        this.batteryRange = batteryRange;
    }

    public int getBatteryRange(){
        return batteryRange;
    }

}

