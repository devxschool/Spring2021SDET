package sets;

import java.util.*;

public class IntroToSet {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,1,5,4,3,2,5,7,6};

        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));

        System.out.println(Arrays.toString(arr));
        System.out.println(set);

        // Array of Strings
        String[] strArr = {"hi", "Hi", "Hello", "Bye", "My", "Coffee", "Hi", "Bye", "Coffee", "Apple", "apple", "APPLE", "SAMSUNG", "2Google"};
        // Converted an array to Arraylist
        List<String> strList = Arrays.asList(strArr);
        // We are passing the arraylist to new Hashset to get rid of duplicates
        Set<String> setOfStr = new HashSet<>(strList);
        System.out.println("Arraylist: " + strList);
        System.out.println("HashSet: " + setOfStr);
        // Storing our Hashset to Treeset
        Set<String> treeSet = new TreeSet<>(setOfStr);
        System.out.println("TreeSet: " + treeSet);
    }
}
