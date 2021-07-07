package maps;

import com.sun.source.tree.BreakTree;

import java.util.*;

public class MapsWithListValues {

    public static void main(String[] args) {

        ArrayList<String> data1 = new ArrayList<>(Arrays.asList("Baha", "1875 Blossom Ridge dr.", "Bolingbrook", "IL", "60490"));
        ArrayList<String> data2 = new ArrayList<>(Arrays.asList("Jeff", "15534 Glacier Ridge dr.", "Albuquerque", "NM", "51290"));
        ArrayList<String> data3 = new ArrayList<>(Arrays.asList("Steve", "187554 Canyon dr.", "Naper", "AZ", "78092"));

        // Map has been created and it takes String as a Key, ArrayList as it's value
        // 3 Arraylists above have been created and key,value pairs for the below map [addressBook] are
        // being retrieved from the Arraylists [data1, data2, data3]
        Map<String, ArrayList<String>> addressBook = new HashMap<>();

        addressBook.put(data1.get(0), data1);
        addressBook.put(data2.get(0), data2);
        addressBook.put(data3.get(0), data3);

        // Look for the customer from the Map and return his address in a map
        System.out.println("Enter the name of the customer: ");
        String nameOfTheCustomer = new Scanner(System.in).next();

        // returnAddressInfo method is being called and params are name we are
        // looking for from the addressBook map and addressBook map as a whole
        System.out.println(returnAddressInfo(nameOfTheCustomer, addressBook));
    }

    /*
    This method takes 2 params, first one being the key [String which is being input by user] and second is ArrayList<> [Which contains
    the address data of the customer].
     */
    static Map<String, String> returnAddressInfo(String name, Map<String, ArrayList<String>> map1) {

        Map<String, String> map = new LinkedHashMap<>();

        map.put("Name", map1.get(name).get(0));
        map.put("Street", map1.get(name).get(1));
        map.put("City", map1.get(name).get(2));
        map.put("State", map1.get(name).get(3));
        map.put("Zip", map1.get(name).get(4));

        return map;
    }

}
