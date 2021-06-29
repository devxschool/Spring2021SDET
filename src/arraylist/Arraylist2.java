package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist2 {

    public static void main(String[] args) {

        // set() method sets the value of the desired index to new value
        List<Character> charList = new ArrayList<>();

        boolean status = charList.isEmpty();
        System.out.println(status);

        charList.add('a');

        status = charList.isEmpty();
        System.out.println(status);

        charList.add('b');

        System.out.println(charList.isEmpty());

        charList.add('c');
        charList.add('d');
        System.out.println(charList);

        charList.set(1, 'f');

        System.out.println(charList);


    }
}
