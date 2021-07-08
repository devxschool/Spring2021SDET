package maps;

import java.util.*;

public class MapIterator {

    public static void main(String[] args) {

        // KeySet() method returns the keys of the Hash Map
        Map<String, String> map = new HashMap<>();
        map.put("Chicago", "IL");
        map.put("Albuquerque", "NM");
        map.put("Urbana", "IL");

        Set<String> setOfKeys = map.keySet();

        System.out.println("Map: " + map);
        System.out.println("Set: " + setOfKeys);
        for (String city: setOfKeys){
            System.out.println(city);
        }

        // Iterator interface's instance created using iterator() method of Collection framework

//==================================================================================
        // boolean hasNext()
        // Returns true if the iteration has more elements.
        // (In other words, returns true if next() would
        // return an element rather than throwing an exception.)

        Iterator<String> iteratorOfTheSet = setOfKeys.iterator();
//        System.out.println(iteratorOfTheSet.next());
//        System.out.println(iteratorOfTheSet.hasNext());
//        System.out.println(iteratorOfTheSet.next());
////        System.out.println(iteratorOfTheSet.next());
//        System.out.println(iteratorOfTheSet.hasNext());
//        System.out.println(iteratorOfTheSet.hasNext());
//        System.out.println(iteratorOfTheSet.hasNext());
//        System.out.println(iteratorOfTheSet.next());
//        System.out.println(iteratorOfTheSet.hasNext());
//        System.out.println(iteratorOfTheSet.next());

        while (iteratorOfTheSet.hasNext()){

            String key = iteratorOfTheSet.next();
            String value = map.get(key);

            System.out.println(key + " -> " + value);
        }

        // printing the values of the map
        Collection<String> states = map.values();
        for (String state: states){
            System.out.println(state);
        }

        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue().toLowerCase());
        }

    }
}
