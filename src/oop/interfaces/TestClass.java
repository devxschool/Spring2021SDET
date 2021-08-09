package oop.interfaces;

public class TestClass implements ElectricVehicle, ElectricVehicleSport {

    @Override
    public long addMiles(long miles) {
        return 0;
    }

    @Override
    public void gear() {
        ElectricVehicle.super.gear();
    }

    @Override
    public void drive() {

    }

    @Override
    public void accelerate(int speed) {

    }
}
