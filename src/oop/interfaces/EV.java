package oop.interfaces;

public interface EV {

    public static final String s = "EV";

    void drive();

    public abstract long addMiles(long miles);

    default void sayHello(){
        System.out.println("Hello EV!");
    }

    default void sayBye(){
        System.out.println("Good bye!");
    }
}
