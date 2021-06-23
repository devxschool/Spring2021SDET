package arrays;

import java.util.Arrays;

public class Arrays_3 {

    public static void main(String[] args) {

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 5;
            System.out.println(i + " + " + 5 + " = " + arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
