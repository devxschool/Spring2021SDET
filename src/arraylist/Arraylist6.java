package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist6 {

    public static void main(String[] args) {

        Float f = Float.valueOf("2.34");
        System.out.println(f);

        float fPrimitive = f;

        System.out.println(fPrimitive);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(50.2);
        doubleList.add(73.4);

        System.out.println(doubleList);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);

        System.out.println("The initial numbers list: " + numbers);
        numbers.remove(Integer.valueOf(2));
        System.out.println("After removing object 2: " + numbers);
        // remove method removes the first occurrence of the target element
        // and if the element does not exist then it won't make any change to the list
        numbers.remove(Integer.valueOf(3));
        numbers.add(4);
        System.out.println("After adding 4: " + numbers);
        // nums[] = {1,2,3,4} -> to get 3 -> nums[2];
        numbers.add(numbers.get(1) + numbers.get(1));
        System.out.println("After adding 4 to the list by adding 2 elements: " + numbers);

        Integer[] numArr = numbers.toArray(new Integer[0]);
        System.out.println("After converting the list to array: " + Arrays.toString(numArr));

        // Converting Arraylist to an array
        List<String> list = new ArrayList<>();
        list.add("Miami");
        list.add("Destin");
        list.add("Jacksonville");

        System.out.println("String arraylist: " + list);

        String[] arr = list.toArray(new String[0]);
        System.out.println("After converting it to array: " + Arrays.toString(arr));

    }
}
