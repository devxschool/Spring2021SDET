package simple_problems_solving;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        // Task:
        // int[] arr = {1,2,3,4,5}
        // Expected output: {5,4,3,2,1}

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("The element at index 2 is: " + arr[2]);
        System.out.println("Given array: " + Arrays.toString(arr));
        System.out.println("Reversed array: " + Arrays.toString(reverseArray(arr)));

    }

    public static int[] reverseArray(int[] ar){

        int[] revArr = new int[ar.length]; // revArr = {0,0,0,0,0}
        int j = 0;

        for (int i = revArr.length-1; i >= 0; i--){
            revArr[j] = ar[i]; // revArr = {5, 4, 3, 2, 1}
            j++;
        }

        return revArr;
    }
}
