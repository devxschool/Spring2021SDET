package arrays;

import java.util.Arrays;

public class Arrays_BinarySearch {

    public static void main(String[] args) {

        int[] arr = {3, 4, 7, 10, -3};
        System.out.println("The original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.println("The index of target element -3 is: " + Arrays.binarySearch(arr, -3));
        System.out.println("The index of target element 4 is: " + Arrays.binarySearch(arr, 4));
        // [-3, 3, 4, 7, 10] -> [-3, 3, 4, 7, 10]
        System.out.println("The index of target element 1 is: " + Arrays.binarySearch(arr, 1));
        System.out.println("The index of target element 5 is: " + Arrays.binarySearch(arr, 5));

        Arrays_BinarySearch arrays_binarySearch = new Arrays_BinarySearch();
        System.out.println("The index of 7 is: " + arrays_binarySearch.findIndex(arr, 7));

    }

    int findIndex(int[] ar, int n){
        for (int i = 0; i < ar.length; i++){
            if(ar[i] == n){
                return i;
            }
        }
        return -1;
    }
}
