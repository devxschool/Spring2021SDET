package simple_problems_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenAndOddNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Even numbers: " + Arrays.toString(findEvenNumbers(numbers)));
        System.out.println("Odd numbers: " + Arrays.toString(findOddNumbers(numbers)));

    }

    static int[] findOddNumbers(List<Integer> list){

        int[] oddNums = new int[list.size()];
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 != 0){
                oddNums[count++] = list.get(i);
            }
        }
        return oddNums;
    }

    static int[] findEvenNumbers(List<Integer> list){

        int[] evenNums = new int[list.size()];
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                evenNums[count++] = list.get(i);
            }
        }
        return evenNums;
    }
}
