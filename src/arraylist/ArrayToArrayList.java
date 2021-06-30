package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'c', 'd'};

        // convert to arraylist
        List<char[]> list = Arrays.asList(arr);

        System.out.println("Initial char array: " + Arrays.toString(arr));
        System.out.println("Initial char list copy of char array: ");

        for (int i = 0; i < list.size(); i++){
            System.out.println(String.valueOf(list.get(i)));
        }

        String[] strArr = {"Baha", "Kosta", "Milda", "Bakai", "Viktoria"};
        //convert string array to String Arraylist
        List<String> strList = Arrays.asList(strArr);

        System.out.println("\nInitial string array: " + Arrays.toString(strArr));
        System.out.println("Initial string list copy of array: " + strList);

        strList.set(2, "Lukas");
        strArr[1] = "Memet";
        System.out.println("Initial string array: " + Arrays.toString(strArr));
        System.out.println("Initial string list copy of array: " + strList);

        // String[] strArr = {"Baha", "Kosta", "Milda", "Bakai", "Viktoria"};
        List<String> strList2 = new ArrayList<>();
        for (String s: strArr){
            strList2.add(s);
        }
        System.out.println("After adding the elements of an array to arraylist with for each: " + strList2);


    }
}
