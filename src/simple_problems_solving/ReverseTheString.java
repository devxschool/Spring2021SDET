package simple_problems_solving;

import java.util.Scanner;

public class ReverseTheString {

    //TASK:
    // 1. Get an input string from the user
    // 2. Create a methods which will take that user input as a parameter
    // and returns it reversed

    //EX: input => "Home" the expected output => "emoH"

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string to be reversed: ");
        String input = scanner.nextLine();

        ReverseTheString object = new ReverseTheString();
        System.out.println(object.reverseString(input));
    }

    String reverseString(String input){
        // i++ value of i will be incremented on the next line or after ";"

        String temp = "";

        for (int i = input.length()-1; i >= 0; i--){

            temp = temp + input.charAt(i);
            // Home
            // 1. temp = e
            // 2. temp = em
            // 3. temp = emo
            // 4. temp = emoH
        }

        return temp;
    }
}
