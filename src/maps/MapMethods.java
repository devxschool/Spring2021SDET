package maps;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Aizada", "Devx");
        map.put("Memet", "SpaceX");
        map.put("Milda", "Devx");

        String valueRemoved = map.remove("Memet");
        System.out.println("This value of the key is being removed: " + valueRemoved);

        // TASK: Create a map which will take the indexes of the array as keys and elements as values
        String[] arr = {"Altay", "Novosibirsk", "Kiev", "Minsk"};

        Map<Integer, String> cities = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            cities.put(i, arr[i]);
        }

        System.out.println("Map entry set: " + cities);

        // Let's replace the value of index 1 with "Yakutsk"

        cities.replace(1, "Yakutsk");
        System.out.println("New map entry set: " + cities);

        // HashMap can have only one null as a key and as many null values can be associated with keys
        cities.put(null, "Balkan");
        System.out.println("The value of the null key is: " + cities.get(null));

        cities.put(4, null);
        cities.put(5, "");

        System.out.println("The null value of key 4 is: " + cities.get(4));

        int size = cities.size();
        System.out.println("Cities map size: " + size);

        // Check isEmpty() method for the key's values
        System.out.println("Check if value is empty? " + cities.get(5).isEmpty());

        cities.clear();

        // isEmpty() method checks if map contains any entries, and returns true if empty and false otherwise
        boolean state = cities.isEmpty();
        System.out.println("Is the cities map empty? " + state);
        System.out.println(cities);
    }
}
