package oop.hospital;

public class Patient {

    String name;
    String DOB;
    String nationality;
    private String phoneNumber;
    private String SSN;
    // the value of final ID cannot be changed once assigned
    // users of this class cannot update the value of final fields
    // from other classes
    public final int ID = 1234;

    public Patient(String name){
        this.name = name;
        nationality = "American";
    }

    public Patient(String name, String DOB){
        this(name);
        this.DOB = DOB;
    }

    public Patient(String name, String DOB, String nationality){
        this(name, DOB);
        this.nationality = nationality;
    }

    public Patient(String name, String DOB, String nationality, String phoneNumber, String SSN){
        this(name, DOB, nationality);
        this.phoneNumber = phoneNumber;
        this.SSN = SSN;
    }

    // setter method to update the value for SSN field
    // by using Character.isDigit() we can prevent users to enter letters or other special characters other than '-'

    public void setSSN(String SSN){
        this.SSN = SSN;
    }
    // getter method returns the desired instance variable
    public String getSSN(){
        return SSN;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() >= 10){
            this.phoneNumber = phoneNumber;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
