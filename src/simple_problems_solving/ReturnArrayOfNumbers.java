package simple_problems_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReturnArrayOfNumbers {
    //1. Take an input from the user as string and convert it to int. [Main method]
    //2. Create a method which takes that [int] input as a parameter
    //and returns an array[] int which holds numbers starting from 1 to input inclusive.
    //   _EX:_ user input = 4;
    //   method returns {1,2,3,4}

    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int n = Integer.parseInt(input);

        ReturnArrayOfNumbers object = new ReturnArrayOfNumbers();

        System.out.println(Arrays.toString(object.returnNumbers(n)));
    }

    protected int[] returnNumbers(int num){

        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        return arr;
    }
}
