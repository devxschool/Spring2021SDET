package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistSort {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(976);
        intList.add(34);
        intList.add(213);
        intList.add(10);
        System.out.println("Before sorting: " + intList);
        Collections.sort(intList);
        System.out.println("After sorting: " + intList);

    }
}
