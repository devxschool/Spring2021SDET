package simple_problems_solving;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInArray {

    /*
    TASK: 1. Initialize an array by getting the size from the user
    2. Create a method which will take array as a parameter
    and return the max element.
     */

    public static void main(String[] args) {

        System.out.println("Please enter a size for the array: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("Now enter the elements for the array: ");
        for (int i = 0; i < size; i++){
            System.out.println("Enter value for " + (i+1) + "'th element: ");
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The max number is: " + findMax(arr));
    }

    private static int findMax(int[] ar){
        // {3,4,1,2} -> 3 > 4, 4 > 1, 1 and 2 -> find max
        int max = ar[0];

        for (int i = 1; i < ar.length; i++){
            if(max < ar[i]){
                max = ar[i];
            }
        }
        return max;
    }
}
