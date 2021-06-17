package simple_problems_solving;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        //TASK:
        // You have a given string and target character
        // return the number of times the target character appears in that string

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = scanner.nextLine();
        System.out.println("Enter a letter to see how many times that letter appears in the sentence: ");
        String target = scanner.next();

        System.out.println("Number of times letter "+target.charAt(0)+" appeared is: "+findNumberOfChars(str, target));

    }

    protected static int findNumberOfChars(String s, String targetChar){

        int count = 0;
        char c = targetChar.charAt(0);

        for (int i = 0; i < s.length(); i++){

            if(s.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
}
