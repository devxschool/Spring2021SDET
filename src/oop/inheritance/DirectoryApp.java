package oop.inheritance;

import java.util.Scanner;

public class DirectoryApp {

    public static void main(String[] args) {

        Engineer employee1 = new Engineer(1, "John", "10/10/1960", "Software engineer", 140000);
        Employee employee2 = new Employee(2, "Elon", "6/11/1966", "CEO", 1000000);
        Security employee3 = new Security(3, "Memet", "8/12/1990", "Senior Security Officer", 100000);
        Engineer employee4 = new Engineer(4, "Aisuluu", "7/05/1967", "Software test engineer", 110000);
        Security employee5 = new Security(5, "Aizada", "04/08/1954", "Senior Security Staff", 120000);
        Employee employee6 = new Employee(6, "Milda", "12/23/1986", "CTO", 250000);
    }
}
