package simple_problems_solving;

import java.util.Scanner;

public class PrintOutCharsFromString {

    public static void main(String[] args) {

        //TASK:
        // 1. Get an input from the user as a string
        // 2. Create a method which will take that input as a parameter
        // and prints out each individual characters from that input with
        // spaces in between each character in the same line

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = scan.nextLine();

        PrintOutCharsFromString object1 = new PrintOutCharsFromString();
        object1.printOutChars(input);

    }

    public void printOutChars(String word){

        for (int i = 0; i < word.length(); i++){

            System.out.print(word.charAt(i) + " ");

        }
    }
}
