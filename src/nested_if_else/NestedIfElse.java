package nested_if_else;

import java.util.Scanner;

public class NestedIfElse {

    public static void main(String[] args) {

        new Scanner(System.in).nextLine();
        int num = new Scanner(System.in).nextInt();

        if ( num > 0 ) {
            if (num < 10)
                if (num % 2 == 0)
                    System.out.println("Number is between 0 and 10 and it's an even number.");
                else
                    System.out.println("Number is between 0 and 10 and it's an odd number.");
        }
        else {
            if (num % 2 == 0)
                System.out.println("Number is less than 0 and it's a negative even number.");
            else
                System.out.println("Number is less than 0 and it's a negative odd number.");
        }

    }
}
