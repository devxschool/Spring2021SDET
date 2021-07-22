package oop.inheritance;

public class Employee {

    private int employeeNumber;
    private String name;
    private String DOB;
    private String jobTitle;
    double salary;

    public String message = "Hello all!";

    public Employee (int employeeNumber, String name, String DOB, String jobTitle, double salary){
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.DOB = DOB;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDOB() {
        return DOB;
    }
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Number promote(){
        return salary += 5000;
    }

    private void simpleMethod(){
        System.out.println("This is a private method in Employee class only!");
    }

    public static void staticMethod(){
        System.out.println("I am static method from Employee class!");
    }
}
