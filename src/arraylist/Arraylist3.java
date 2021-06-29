package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist3 {

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<Integer>();

        int count = 5;
        for (int i = 0; i <= 4; i++){
            numList.add(i);
            System.out.println("Adding this number: " + i);
            System.out.println("Updating " + i + " with " + count);
            numList.set(i, count--);
        }
        System.out.println("Before clearing the list: " + numList);

        // assigning the element at index 3 to int variable
        int numAtIndex3 = numList.get(3);
        // adding variable to element at index 1
        System.out.println("Adding variable to element at index 1: " + (numAtIndex3 + numList.get(1)));

        System.out.println(numList.contains(3));
        System.out.println(numList.contains(6));

        numList.clear();
        System.out.println("After clearing the list: " + numList.isEmpty());
        System.out.println("The values in list after clearing: " + numList);
    }
}
