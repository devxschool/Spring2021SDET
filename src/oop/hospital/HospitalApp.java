package oop.hospital;

public class HospitalApp {

    public static void main(String[] args) {

        Patient patient1 = new Patient("Elon Musk");
        //System.out.println(patient1.name + "'s nationality is: " + patient1.nationality);

        Patient patient2 = new Patient("Satya Nadella", "10/05/1970");
        //System.out.println(patient2.name);
        System.out.println(patient2.DOB);
        //System.out.println(patient2.name + "'s nationality is: " + patient2.nationality);

        Patient patient3 = new Patient("Sundar Pichai", "11/21/1973", "Indian - American");

        System.out.println(patient3.DOB);


        Patient patient4 = new Patient("Richard Branson", "12/25/1965", "Australian", "222-222-5656", "000-00-0001");

        System.out.println("DOB: " + patient4.DOB);

        System.out.println("Phone Number: " + patient4.getPhoneNumber());

        // let's try to update the phone number for patient4
        patient4.setPhoneNumber("123-120-1234");
        System.out.println("Here it is new phone number: " + patient4.getPhoneNumber());


        // we are updating the SSN for patient
        patient4.setSSN("abccd-sjfh");

        System.out.println("New SSN for patient is: " + patient4.getSSN());

        patient4.setName("Sir Richard Branson");
        System.out.println(patient4.getName());


    }
}
