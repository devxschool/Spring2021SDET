package scanner_increment_decrement;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {

        String time = "Morning";

        //if time equals to Morning
        //? => then return "Gym"
        //: => otherwise return "DevX Class";

        String whereShouldIGo = time == "Evening" ? "Gym" : "Java Class";
        System.out.println(whereShouldIGo);

        String carOffered = "Kia";
        // buy -> holds the outcome of the condition
        // carOffered == "Toyota" -> condition
        //
        boolean buy = carOffered == "Toyota" || carOffered == "Kia" ? true : false;

        /*
            if(carOffered == "Toyota"){
                return true;
                }
                else{
                return false;
              }

        */

        System.out.println(buy);

        int num = 110;

        if( num < 100 ){
            System.out.println("number is less than 100");

            if(num > 50){
                System.out.println("number is greater than 50");
            }
        }
        else if(num > 100) {
            System.out.println("Number is bigger than 100");

            if(num < 200){
                System.out.println("Number is less than 200");
            }
        }

        // PRIME NUMBER -> it can only be divided by itself or by one without any remainder;
        // PRIME NUMBER -> 1, 3, 5, 7, 11, 13, 17, 19, 1731 ETC.


        /*
        To qualify for the loan, a person must make at least $30,000
        and to have been working at their current job for at least 2 years
         */

        System.out.println("Please enter your annual income:");
        double salary = new Scanner(System.in).nextDouble();

        if(salary >= 30000){
            System.out.println("Please enter your years of employment:");
            int yearsOfEmployment = new Scanner(System.in).nextInt();
            if(yearsOfEmployment >= 2){
                System.out.println("Congrats! You are qualified for the loan.");
            }
            else {
                System.out.println("Sorry! You need at least 2 years of employment.");
            }
        }else {
            System.out.println("Sorry! Your salary has to be at least $30,000.");
        }


    }
}
