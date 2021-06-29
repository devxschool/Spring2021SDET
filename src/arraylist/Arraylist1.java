package arraylist;
import java.util.*;

public class Arraylist1 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList();
        int i = 9;
        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(7);
        list1.add(i);
        int x = list1.get(2);
        int a = list1.get(1) + 1;

        System.out.println(list1);

        double j = 2.34;
        int g = (int) j; // explicit type cast (narrowing casting)

        ArrayList<String> strList = new ArrayList<>();
        System.out.println(strList.size()); // here the size is still 0 because we have not added any elements to list
        strList.add("ML");
        strList.add("AI");
        strList.add("Hadoop");
        System.out.println(strList.size());
        System.out.println(strList);
        // adding an element at specified index
        strList.add(1, "Dark Web");
        System.out.println(strList);

        //removing elements from the list
        System.out.println(strList.remove("AI"));
        System.out.println(strList);
        System.out.println(strList.remove("Deep Web"));
        System.out.println("Removing index 0: " + strList.remove(0));
        System.out.println(strList);


    }
}
