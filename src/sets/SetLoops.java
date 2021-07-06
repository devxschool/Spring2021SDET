package sets;

import java.util.HashSet;
import java.util.Set;

public class SetLoops {

    public static void main(String[] args) {

        Set<Double> set = new HashSet<>();

        for (double i = 1; i <= 5; i++){
            set.add(i * 10);
        }

        // enhanced for loop tp iterate over set collection
        for (double c: set){
            System.out.println(c);
        }

        //forEach() loop with Lambda expression
        System.out.println("Below is the output of elements in forEach() loop: ");
        set.forEach(System.out::println);

    }
}
