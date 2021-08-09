package oop.interfaces;

public class ElectricTruck extends AbstractEV{

    public ElectricTruck(String color, String make, long vin, int yearMake, long miles) {
        super(color, make, vin, yearMake, miles);
    }

    @Override
    public long addMiles(long miles) {
        super.setMiles(super.getMiles()+miles);
//        System.out.println(super.getMiles());
        return super.getMiles();
    }

}
