package arrays;

import java.util.Arrays;

public class SplitStringIntoStringArray {

    public static void main(String[] args) {

        String s = "I love San Francisco";

        String [] strArr = s.split(" ");

        System.out.println(s);
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);
    }
}
