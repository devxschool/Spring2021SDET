package oop.interfaces;

public class ElectricCar extends AbstractEV {

    public ElectricCar(String color, String make, long vin, int yearMake, long miles) {
        super(color, make, vin, yearMake, miles);
    }

    public long addMiles(long miles){
        super.setMiles(super.getMiles() + miles);
//        System.out.println(super.getMiles());
        return super.getMiles();
    };

    @Override
    public void accelerate(int speed) {
        System.out.println("EV Sport has gained speed of: " + speed + " mph");
    }

    public void gear(){
        System.out.println("Electric car gears");
    };
}
