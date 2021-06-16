package simple_problems_solving;

import java.util.Scanner;

public class EvenAndOddNumber {

    /*
    TASK:
    1. Get an input from the user
    2. Create a method which will print out if the given input number is "Even" or "Odd"
     */

    public static void main(String[] args) {
        // odd number -> number that can be divided by 2 with remainder of 1
        // EX: Odd numbers: 13, 3, 9, 33, etc.
        // even number -> numbers that cen be divided by 2 with remainder of 0
        // EX: Even numbers: 4, 8, 12, 16 etc.
        // Modulus(%) -> is to get the remainder of 2 numbers after dividing them
        System.out.println("Please enter a number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(printNumberType(n));

    }

    public static String printNumberType(int input){
        // when we divide any number by 2 and remainder is 0, then it is even number
        // we use modulus(%) to get the remainder of a number divided by another number
        if(input % 2 == 0) {
            return "Even";
        }

        return "Odd";
    }
}
