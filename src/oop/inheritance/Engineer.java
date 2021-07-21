package oop.inheritance;

public class Engineer extends Employee{



    public Engineer(int employeeNumber, String name, String DOB, String jobTitle, double salary){
        super(employeeNumber, name, DOB, jobTitle, salary);
    }

    public Double promote(){
        return super.salary += 7000;
    }
}
