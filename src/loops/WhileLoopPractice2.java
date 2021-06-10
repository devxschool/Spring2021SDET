package loops;

import java.util.Scanner;

public class WhileLoopPractice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Task
        // we will keep getting an input from the user until we get 8
        // when we get 8 from

        System.out.println("Please input a number: ");
        int x = scan.nextInt();
        boolean flag = true;

        while (flag) {

            if (x == 8) {
                flag = false;
            } else {
                System.out.println("Please try another number to exit!");
                x = scan.nextInt();
            }

        }


        //This will never run because while loop checks the condition first before executing the body
        // below condition is always false
        int n = 0;
        while (5 < n){
            System.out.println("Hello world!");
        }


    }
}
