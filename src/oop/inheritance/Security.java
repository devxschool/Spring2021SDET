package oop.inheritance;

public class Security extends Employee{

    public Security(int employeeNumber, String name, String DOB, String jobTitle, double salary){
        //System.out.println("This is constructor");
        //super() call must be the first statement inside the constructor body
        super(employeeNumber, name, DOB, jobTitle, salary);
    }
}
