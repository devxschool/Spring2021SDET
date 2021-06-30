package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist5 {

    public static void main(String[] args) {

        // equals() method from ArrayList
        List<String> cities1 = new ArrayList<>();
        System.out.println("Is it empty? " + cities1.isEmpty());
        System.out.println("The size of the list: " + cities1.size());
        System.out.println("Contents of list: " + cities1);

        cities1.add("Orlando");
        cities1.add("Seattle");
        cities1.add("Portland");

        System.out.println("cities1: " + cities1);

        List<String> cities2 = new ArrayList<>();
        
        cities2.addAll(cities1);
        cities2.add("Chicago");

        System.out.println("cities2: " + cities2);

        System.out.println("Are these 2 lists equal? " + cities1.equals(cities2));
        
        List<String> cities3 = new ArrayList<>();
        cities3.add("San Francisco");
        cities3.add("Bishkek");
        cities3.add("Moscow");

        System.out.println("Initial cities3: " + cities3);

        cities3.addAll(1, cities1);
        System.out.println("After adding cities1 at index 1 to cities3: " + cities3);
    }
}
