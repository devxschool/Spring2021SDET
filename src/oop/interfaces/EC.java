package oop.interfaces;

public class EC extends AbstractEV {

    public EC(long miles) {
        super(miles);
    }

    public long addMiles(long miles){
        super.setMiles(super.getMiles() + miles);
//        System.out.println(super.getMiles());
        return super.getMiles();
    };
}
