package oop.interfaces;

public interface ElectricVehicleSport {

    public abstract void drive();

    public static final int horsePower = 350;

    void accelerate(int speed);

    default void gear(){
        System.out.println("EV sport gears");
    };
}
