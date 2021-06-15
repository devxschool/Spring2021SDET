package loops.for_loop;

import java.util.Scanner;

public class ForLoop3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a word: ");
        String input = scan.nextLine();

        System.out.println(isLetterDigit(input));

    }

    public static boolean isLetterDigit(String word){

        for (int i = 0; i < word.length(); i++){
            if(Character.isLetterOrDigit(word.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
