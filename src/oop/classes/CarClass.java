package oop.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarClass {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.make = "Lexus";
        car1.model = "R8";
        car1.yearMade = 2018;
        car1.color = "White";

        System.out.println(car1.make);
        System.out.println(car1.model);

        Car car2 = new Car();
        car2.make = "Toyota";
        car2.model = "Camry";
        car2.yearMade = 2019;
        car2.color = "Silver";

        System.out.println(car2.make);
        System.out.println(car2.model);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        System.out.println();
    }
}

class Car {

    String make;
    String model;
    int yearMade;
    String color;

}

