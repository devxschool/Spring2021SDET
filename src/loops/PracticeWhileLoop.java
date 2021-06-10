package loops;

import java.util.Scanner;

public class PracticeWhileLoop {

    public static void main(String[] args) {

        // Task
        // We want to know how many times a given number can be divided
        // by 2 before it becomes less then or equal to 1 [to calculate the power of number by 2]
        // 2 ^ 0 = 1, 2 ^ 2 = 4, 2 ^ 3 = 8, 2 ^ 4 = 16, 2 ^ 5 = 32 etc.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to know how many times it can be divided by 2: ");
        int input = scan.nextInt();
        int count = 0;

        while (input > 1){
            input = input / 2;
            count++;
        }

        System.out.println("The number you have entered can be divided by 2: " + count + " times.");


    }
}
