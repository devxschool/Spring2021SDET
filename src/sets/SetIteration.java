package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIteration {

    public static void main(String[] args) {

        System.out.println("Below are the types of set collections: ");

        Set<String> setIntegers = new HashSet<>();
        for (int i = 0; i < 5; i++){
            setIntegers.add(String.valueOf(i));
        }
        System.out.println("HashSet: " + setIntegers);

        Set<String> names = new LinkedHashSet<>(); // HashSet, TreeSet, LinkedHashSet
        names.add("Milda");
        names.add("Bema");
        names.add("Aisha");
        names.add("Memet");
        names.add("Dinara");

        System.out.println("LinkedHashset: " + names);

        Set<String> namesOrdered = new TreeSet<>(names);
        System.out.println("TreeSet: " + namesOrdered);

        System.out.println("Is Memet in the list: " + names.contains("Memet"));

        // Remove method's return type is boolean, it checks if the targeted element [Object]
        // is in the collection or not, if it's present then it returns true otherwise false;
        if(names.remove("Memet")) System.out.println("Memet has been removed.");
        else System.out.println("Memet is not in the list.");

        if(names.remove("Aisulu")){
            System.out.println("Aisulu has been removed");
        }
        else {
            names.add("Aisulu");
            System.out.println("Aisulu has been added into the list.");
        }
    }
}
