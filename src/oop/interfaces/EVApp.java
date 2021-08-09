package oop.interfaces;

public class EVApp {

    public static void main(String[] args) {

        ElectricVehicle model3 = new ElectricCar("Black", "Tesla", 12322323, 2020, 10);
        System.out.println(model3.addMiles(37));

        //ElectricVehicleSport model99 = new ElectricCar();

        ElectricVehicleSport modelS = new ElectricCar("Red", "Tesla", 128741848, 2021, 5);
        modelS.accelerate(140);

        TestClass testClass = new TestClass();
        testClass.gear();

    }
}
