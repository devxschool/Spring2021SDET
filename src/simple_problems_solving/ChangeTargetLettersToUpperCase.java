package simple_problems_solving;

import java.util.Scanner;

public class ChangeTargetLettersToUpperCase {

    //TASK:
    // 1. Get 2 inputs from the user as a string, first input-String, second-character
    // 2. Create a method which will take that both inputs as parameters
    // and convert the characters from the given string
    // to Upper case if they are equal to character input
    //How to compare 2 characters? 'a' == 'b'

    //EX: word = "Menomonee", target = "e" -> Output: "MEnomonEE"

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String word = scanner.nextLine();
        System.out.println("Now enter a character you want to be Uppercase: ");
        String target = scanner.next();

        ChangeTargetLettersToUpperCase object1 = new ChangeTargetLettersToUpperCase();
        System.out.println(object1.convertCharToUppercase(word, target));
    }

    private String convertCharToUppercase(String word, String target){

        String resultString = "";

        for (int i = 0; i < word.length(); i++){
            // Converting the value of character to String
            String tempString = Character.toString(word.charAt(i)); //String.valueOf(word.charAt(i));
            // Comparing 2 strings but before we are converting char to String
//            if(tempString.equals(target)){
//                resultString = resultString + tempString.toUpperCase();
//            }

            // Comparing 2 strings by using substring to get a letter from the string

            if(word.substring(i,i+1).equals(target)){
                resultString = resultString + tempString.toUpperCase();
            }
            else resultString = resultString + tempString;
        }

        return resultString;
    }
}
