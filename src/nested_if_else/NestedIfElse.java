package nested_if_else;


import java.util.*;

public class NestedIfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter any number including negative numbers: ");
        int num = new Scanner(System.in).nextInt();

        System.out.println("The absolute value of the number you have entered: " + Math.abs(num));

        num = Math.abs(num);

        System.out.println("The square root of the number you have entered: " + Math.sqrt(num));
        // this pow method is going to take 2 arguments and it will multiply first argument by itself second argument times
        // x^n means x is multiplied by itself n times.
        System.out.println(Math.pow(3, 4));

        System.out.println(Math.ceil(2.3));
        System.out.println(Math.floor(2.9));

        // I need 3 inputs from the user (a,b,c)
        System.out.println("Please enter a number: ");
        int a = scan.nextInt();
        System.out.println("Please enter a number: ");
        int b = scan.nextInt();
        System.out.println("Please enter a number: ");
        int c = scan.nextInt();

        int max = 0;

        // given above 3 inputs, find the max integer among them
        if(a > b && a > c){
            max = a;
        }else if(b > a && b > c){
            max = b;
        }else {
            max = c;
        }

        System.out.println("The max number is: " + max);

        System.out.println("Max between these 2 numbers: " + Math.max(5165156156156156651L, 515615615615615616L));

        double rand = Math.random();

        // Output is different everytime this code is executed
        System.out.println("Random Number:" + rand);

    }
}
