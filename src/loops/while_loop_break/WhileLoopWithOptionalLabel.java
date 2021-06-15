package loops.while_loop_break;

import java.util.Scanner;

public class WhileLoopWithOptionalLabel {

    public static void main(String[] args) {

        // TASK:
        // get an input from the user and check it's length
        // if the length is equal to 1. then we need to break out of the loop
        // until it's length is equal to 1 keep getting an input from the user

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String s = scan.next();


        while (true){
            if(s.length() > 1){
                System.out.println("Please enter another word: ");
                s = scan.next();
                continue;
            }
            else if(s.length() == 1){
                System.out.println("This can be stored in a char variable!");
                // When this condition is satisfied, break will stop the loop and it exits the loop
                break;
            }
        }
    }
}
