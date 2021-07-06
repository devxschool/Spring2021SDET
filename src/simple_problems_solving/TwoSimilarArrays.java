package simple_problems_solving;

import java.util.*;

public class TwoSimilarArrays {

    public static void main(String[] args) {

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        // Numbers from 1-10;
        for (int i = 0; i < 10; i++){
            arr1[i] = i + 1;
            arr2[i] = i + 3;
            arr3[i] = i + i;
        }

        System.out.println("Arrays 1: " + Arrays.toString(arr1));
        System.out.println("Arrays 2: " + Arrays.toString(arr2));
        System.out.println("Arrays 3: " + Arrays.toString(arr3));

        //TASK: Print out all the unique elements that's shared in all these 3 arrays
        // in one collection
        // EX: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 18

        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < 10; i++){
            numbers.add(arr1[i]);
            numbers.add(arr2[i]);
            numbers.add(arr3[i]);
        }

        System.out.println("Unique numbers: " + numbers);

        System.out.println(arr1[5]);



    }
}
