package sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Iskander");
        if(names.add("Aizada")){
            System.out.println("Adding Aizada for the first time!");
        }
        names.add("Dinara");
        names.add("Milda");
        boolean b = names.add("Aizada");
        if(b){
            System.out.println("Aizada was already added!");
        }

        System.out.println("HashSet: " + names);
        TreeSet<String> treeSet = new TreeSet<>(names);
        System.out.println("TreeSet: " + treeSet);

        if(treeSet.contains("Iskander"))
            System.out.println("Iskander is present in set and also in class.");

        // Size() method returns the number of elements in set collection
        System.out.printf("The size of names is: %d \n", names.size());

        Set<Integer> intTreeSet = new TreeSet<>();
        intTreeSet.add(7);
        intTreeSet.add(3);
        intTreeSet.add(5);
        intTreeSet.add(5);
        intTreeSet.add(3);
        intTreeSet.add(4);
        intTreeSet.add(9);
        intTreeSet.add(1);

        System.out.println("Integer TreeSet: " + intTreeSet);

        if(intTreeSet.remove(6)){
            System.out.println("6 has been removed.");
        }
        else {
            System.out.println("6 does not exist in set!");
        }
        if (intTreeSet.remove(5)){
            System.out.println("5 got removed.");
        }
        else System.out.println("Number 5 does not exist in set.");
    }
}
