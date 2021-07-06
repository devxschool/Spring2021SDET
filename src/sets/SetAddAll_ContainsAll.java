package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetAddAll_ContainsAll {

    public static void main(String[] args) {
        Set<String> cities1 = new HashSet<>(Arrays.asList("Chicago", "LA", "NYC", "Kiev", "Boston", "Moscow"));
        System.out.println("Cities1 before union: " + cities1);
        Set<String> cities2 = new HashSet<>(Arrays.asList("London", "Kiev", "Vienna", "Moscow", "Brussels","Paris"));
        System.out.println("Cities2 before union: " + cities2);

        System.out.println("Before union. Do cities in cities2 present in cities1: " + cities1.containsAll(cities2));

//        cities1.retainAll(cities2);
//        System.out.println("Common cities are stored now in cities1: " + cities1);

        cities1.addAll(cities2);
        System.out.println("After union cities1: " + cities1);
        System.out.println("After union cities2: " + cities2);

        System.out.println("After union. Do cities in cities2 present in cities1: " + cities1.containsAll(cities2));

        cities2.add("OSH");
        cities2.add("Istanbul");
        System.out.println("Cities2 after union and 2 more cities added to it: " + cities2);

        // intersection [common elements] of 2 set collections to be reatined into one set collection
        cities2.retainAll(cities1);
        System.out.println("Cities2 after intersection operation: " + cities2);

    }
}
