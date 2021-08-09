package oop.interfaces;

public interface ElectricVehicle {

    public static final String s = "EV";
    public static final int yearMake = 1987;

    public abstract void drive();

    public abstract long addMiles(long miles);

    default void sayHello(){
        System.out.println("Hello EV!");
    }

    default void sayBye(){
        System.out.println("Good bye!");
    }

    default void gear(){
        System.out.println("EV gears");
    };
}
