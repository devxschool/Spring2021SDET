package oop.inheritance;

import java.util.Scanner;

public class DirectoryApp {

    public static void main(String[] args) {

        Engineer employee1 = new Engineer(1, "John", "10/10/1960", "Software engineer", 140000, false);
        Employee employee2 = new Employee(2, "Elon", "6/11/1966", "CEO", 1000000);
        Security employee3 = new Security(3, "Memet", "8/12/1990", "Senior Security Officer", 100000);
        Engineer employee4 = new Engineer(4, "Aisuluu", "7/05/1967", "Software test engineer", 110000, true);
        Security employee5 = new Security(5, "Aizada", "04/08/1954", "Senior Security Staff", 120000);
        Employee employee6 = new Employee(6, "Milda", "12/23/1986", "CTO", 250000);

        // polymorphism
        // methods that are available actually are defined by the dataType of a variable, not an object assigned;

        Employee johnDoe = new Engineer(7, "Tim", "12/12/1990", "SDET", 130000, true);

        johnDoe.promote();
        System.out.println("Employee got promoted: " + johnDoe.salary);

        System.out.println("From Employees class: " + johnDoe.message);
        System.out.println("From Engineer class: " + ((Engineer)johnDoe).message);

        System.out.println("Before promotion: " + employee4.salary);

        employee4.promote();
        System.out.println("Engineer promoted on target: " + employee4.salary);

        employee4.setOnTarget(false);
        employee4.promote();
        System.out.println("Engineer promoted not on target: " + employee4.salary);

        // let's print out fro static methods
        Employee.staticMethod();
        Engineer.staticMethod();

        // number of objects created from Engineer class
        System.out.println(Engineer.count);

    }
}
