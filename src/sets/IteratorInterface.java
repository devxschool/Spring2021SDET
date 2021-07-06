package sets;

import java.util.*;

public class IteratorInterface {

    public static void main(String[] args) {

        Set<String> nameList = new HashSet<>(Arrays.asList("Memet", "Aisha", "Noilya", "Viktoria", "Iskander"));

        // Iterator is used to loop through collections to target elements separately
        // and iterator name should be provided in order to start an iteration
        Iterator<String> namesListIterator = nameList.iterator();

        List<String> namesArrayList = new ArrayList<>();
        int nameCount = 1;
        while (namesListIterator.hasNext()){
            // this name variable holds the elements that are in the set
            // next method returns the next element in the iteration of the collection
            // that's being looped through
            String name = namesListIterator.next();
            namesArrayList.add(name);
            System.out.println("Person "+nameCount++ +": "+name);

            // we are checking if the name is present in the collection
            // and if it is then we are storing it in name variable to print out
            if(name.equalsIgnoreCase("Viktoria")){
                System.out.println("Here is the name we are looking for: " + name);
            }
        }

        System.out.println("Now names are in an arraylist: " + namesArrayList);
        System.out.println("Here is: " + namesArrayList.get(3));
    }
}
