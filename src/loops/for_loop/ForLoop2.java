package loops.for_loop;

import java.util.Scanner;

public class ForLoop2 {

    public static void main(String[] args) {

        // TASK:
        // Create a method and it should
        // return true if the given string contains any digit
        // else return false
        // EX: "k8s" -> true, "4ev4564er" -> true, "ama7zon" -> false;

        // str.length();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any word: ");
        String input = scan.nextLine();

        System.out.println(containsDigit(input));
    }

    // I want to create a method with will return Boolean and take input as String
    private static boolean containsDigit(String word){

        boolean isDigit = false;
        //EX: word = "Aiza6da"


        for (int i = 0; i < word.length(); i++){
            // Character class has a method called isDigit() and it returns true
            // if the given char is digit.
            char temp = word.charAt(i); //temp holds the current (i'th) char from the string
            if(Character.isDigit(temp)){

                isDigit = true;
            }
        }
        return isDigit;
    }
}
