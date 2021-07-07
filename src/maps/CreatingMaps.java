package maps;

import java.util.*;

public class CreatingMaps {

    public static void main(String[] args) {

        // map was created with String type as the Key and Integer type as it's Value
        Map<String, Integer> ageInfo = new HashMap<>();
        ageInfo.put("Elon Musk", 45);
        ageInfo.put("Sundar Pichai", 49);
        ageInfo.put("Satya Nadella", 53);

        System.out.println("HashMap: " + ageInfo);

        System.out.println("The age of Sundar Pichai: " + ageInfo.get("Sundar Pichai"));

        // TreeMap where keys are ordered in Natural order
        Map<String, Integer> ageInfo1 = new TreeMap<>();
        ageInfo1.put("Tim Cook", 60);
        ageInfo1.put("Elon Musk", 45);
        ageInfo1.put("Sundar Pichai", 49);
        ageInfo1.put("Satya Nadella", 53);

        System.out.println("TreeMap: " + ageInfo1);

        // LinkedHashMap where keys are ordered in insertion order
        Map<String, Integer> ageInfo2 = new LinkedHashMap<>();
        ageInfo2.put("Tim Cook", 60);
        ageInfo2.put("Elon Musk", 45);
        ageInfo2.put("Sundar Pichai", 49);
        ageInfo2.put("Satya Nadella", 53);

        System.out.println("LinkedHashMap: " + ageInfo2);

        Map<String, String> companyCEO = new HashMap<>();
        companyCEO.put("Tim Cook", "Apple");
        companyCEO.put("Elon Musk", "Tesla");
        companyCEO.put("Sundar Pichai", "Google");
        companyCEO.put("Satya Nadella", "Microsoft");

        System.out.println("HashMap: " + companyCEO);

        // By using containsKey() method we will be able to check if the map contains desired key
        System.out.println("Please search for VIP person: ");
        String name = new Scanner(System.in).nextLine();
        if(companyCEO.containsKey(name)) System.out.println(name + " is the CEO of " + companyCEO.get(name));
        else System.out.println(name + " is not in the map.");
    }
}
