package simple_problems_solving;

import java.util.Arrays;

public class ReturnOddNumberFromArray {

    public static void main(String[] args) {

        //Task:
        // Given array
        // Write a method that returns an array of odd numbers

        int [] arr = {23, 34, 45, 76, 12, 0, 47, 63, 98};
        // {23, 45, 47, 63}

        ReturnOddNumberFromArray obj = new ReturnOddNumberFromArray();
        System.out.println(Arrays.toString(obj.findOddNumbers(arr)));

    }

    private int[] findOddNumbers(int[] ar){

        int[] oddNumbers = new int[ar.length];
        for (int i = 0; i < ar.length; i++){
            if(ar[i] % 2 != 0){
                oddNumbers[i] = ar[i];
            }
        }
        return oddNumbers;
    }
}
