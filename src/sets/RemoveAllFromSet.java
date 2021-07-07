package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveAllFromSet {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6,7,8,9));

        System.out.println(set1.removeAll(set2));
        System.out.println("After removing common elements: " + set1);
    }
}
