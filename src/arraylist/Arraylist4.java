package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist4 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        List<int[]> arrList = new ArrayList<>();
        arrList.add(arr1);
        arrList.add(arr2);
        arrList.add(arr3);

        for (int i = 0; i < arrList.size(); i++){
            System.out.println(Arrays.toString(arrList.get(i)));
        }
        System.out.println(Arrays.deepToString(arrList.toArray()));
    }
}
