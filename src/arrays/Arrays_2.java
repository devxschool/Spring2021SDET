package arrays;

import java.util.Arrays;

public class Arrays_2 {

    public static void main(String[] args) {

        int [] arr = new int[3];
        arr[0] = 2;
        arr[1] = 3;

        //variable to hold the length of the arr[]
        int len = arr.length;

        System.out.println(Arrays.toString(arr));
        //Current arr = [2, 3, 0]
        //0, 2, 3
        Arrays_2 arrays_2 = new Arrays_2();
        System.out.println(Arrays.toString(arrays_2.sortArray(arr)));
        // sort() method is used to sort the elements of an array in ascending order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int [] reversedArr = new int[len];

        // reversing the order of elements after sorting
        for(int i = 0; i < len; i++){
            // assigning the last element of the existing array (arr[])
            // to the beginning of the new array (reversedArr[])
            reversedArr[i] = arr[len - (i+1)];
        }

        System.out.println("Reversed array: " + Arrays.toString(reversedArr));
    }

    int[] sortArray(int[] ar){
        int temp = 0;
        if(ar[0] > ar[1] && ar[0] > ar[2]){
            if(ar[1] > ar[2]){
                return new int[]{ar[2], ar[1], ar[0]};
            }
            else return new int[]{ar[1], ar[2], ar[0]};
        }
        if(ar[1] > ar[0] && ar[1] > ar[2]){
            if(ar[0] > ar[2]){
                return new int[]{ar[2], ar[0], ar[1]};
            }
            else return new int[]{ar[0], ar[2], ar[1]};
        }
        else {
            if(ar[0] > ar[1]){
                return new int[]{ar[1],ar[0],ar[2]};
            }else return new int[]{ar[0], ar[1], ar[2]};
        }
    }
}
