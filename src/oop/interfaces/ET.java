package oop.interfaces;

public class ET extends AbstractEV{

    public ET(long miles) {
        super(miles);
    }

    @Override
    public long addMiles(long miles) {
        super.setMiles(super.getMiles()+miles);
//        System.out.println(super.getMiles());
        return super.getMiles();
    }
}
