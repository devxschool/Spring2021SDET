package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultidimensionalArraylist {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        List<Integer> list3 = new ArrayList();

        for(int i = 1; i < 4; i++){
            list1.add(i);
        }
        for(int i = 4; i < 9; i++){
            list2.add(i);
        }
        for(int i = 9; i < 17; i++){
            list3.add(i);
        }

        System.out.println("List-1: " + list1);
        System.out.println("List-2: " + list2);
        System.out.println("List-3: " + list3);

        List <List<Integer>> finalList = new ArrayList<>();
        finalList.add(list1);
        finalList.add(list2);
        finalList.add(list3);

        System.out.println("Final list: " + finalList);
        System.out.println("This should be 6: " + finalList.get(1).get(2));
        // finalList = [ [1, 2, 3, 10], [4, 5], [7, 8, 9] ]
        // finalList[1][0]
        int[] arr = new int[finalList.size()];

        for (int i = 0; i < finalList.size(); i++){
            arr[i] = finalList.get(i).get(finalList.get(i).size() - 1);
        }

        System.out.println("The last elements of lists: " + Arrays.toString(arr));

    }
}
