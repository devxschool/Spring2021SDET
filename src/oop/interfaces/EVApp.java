package oop.interfaces;

public class EVApp {

    public static void main(String[] args) {

        EV ev = new EC(10);
        ((EC)ev).getMiles();

        AbstractEV et = new ET(100);
        System.out.println("Before adding miles: " + et.getMiles());
        et.addMiles(25);
        System.out.println("After adding 25 miles: " + et.getMiles());

    }
}
