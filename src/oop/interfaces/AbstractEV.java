package oop.interfaces;

public abstract class AbstractEV implements ElectricVehicle, ElectricVehicleSport {


    private String color;
    private String make;
    private long vin;
    private int yearMake;
    private long miles;

    public AbstractEV(String color, String make, long vin, int yearMake, long miles) {
        this.color = color;
        this.make = make;
        this.vin = vin;
        this.yearMake = yearMake;
        this.miles = miles;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public long getVin() {
        return vin;
    }

    public void setVin(long vin) {
        this.vin = vin;
    }

    public int getYearMake() {
        return yearMake;
    }

    public void setYearMake(int yearMake) {
        this.yearMake = yearMake;
    }

    public void drive() {
        System.out.println("Driving abstract electric car");
    }

    @Override
    public void gear() {
        ElectricVehicle.super.gear();
    }

    @Override
//    public void gear() {
//        ElectricVehicle.super.gear();
//    }

    public void accelerate(int speed) {
    }

    public long getMiles() {
        return miles;
    }

    public void setMiles(long miles) {
        this.miles = miles;
    }
}
