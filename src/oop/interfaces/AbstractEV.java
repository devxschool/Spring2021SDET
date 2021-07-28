package oop.interfaces;

public abstract class AbstractEV implements EV{

    private long miles;

    public void drive(){
        System.out.println("Driving electric car");
    }

    public AbstractEV(long miles){
        this.miles = miles;
    }

    public long getMiles(){
        return miles;
    }

    public void setMiles(long miles){
        this.miles = miles;
    }
}
