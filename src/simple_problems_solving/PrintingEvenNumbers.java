package simple_problems_solving;

import java.util.Arrays;
import java.util.Scanner;

public class PrintingEvenNumbers {

    public static void main(String[] args) {

        /*
        TASK: 1. Write a method which will take input from the user as a parameter
        2. Return an array which has all the even numbers up to the user input
        EX: user input 10
        then I should return even numbers from 1 to users input {2, 4, 6, 8, 10}
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scan.nextInt();

        System.out.println(Arrays.toString(printEvenNumbers(n)));
    }

    protected static int[] printEvenNumbers(int n){

        int [] arr = new int[n/2];
        int count = 0;
//        for (int i = 1; i <= n; i++){
//            if(i % 2 == 0){
//                arr[count] = i;
//                count++;
//            }
//        }

        for (int i = 2; i <= n; i=i+2){

            arr[count] = i;
            count++;

        }
        return arr;
    }
}
