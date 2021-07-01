package simple_problems_solving;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {

        // Task: Find the missing number from given array

        int[] arr = {5,2,7,4,1,9,6,8,10};
        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
        int max = arr[arr.length-1];
        int sumOfNatNumber = max*(max+1)/2;
//        for (int i = 1; i <= arr[arr.length-1]; i++){
//            sumOfNatNumber += i;
//        }

        int sumOfArrNums = 0;
        for (int i = 0; i < arr.length; i++){
            sumOfArrNums += arr[i];
        }

        int missingNumber = sumOfNatNumber - sumOfArrNums;
        System.out.println("Here is the missing number: " + missingNumber);
    }
}
