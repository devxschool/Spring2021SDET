package arrays;

import java.util.Arrays;

public class StringToCharArray {

    public static void main(String[] args) {

        String s = "I love Chicago";
        // initializing an array of characters in size of string
        char[] charArr = new char[s.length()];

        // converting string into character array by traversing through the string and using charAt()
        // method and targeting each char separately from the given string and storing them into char array
        for(int i = 0; i < charArr.length; i++){
            charArr[i] = s.charAt(i);
        }

        System.out.println(Arrays.toString(charArr));


        char[] charArr1 = s.toCharArray();
        System.out.println(Arrays.toString(charArr1));
    }
}
