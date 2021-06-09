package loops;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        //Task
        //print out "Hello World" 10 different times
        /*

        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");

         */

        // this is called an infinite loop where condition will always be true
//        int n = 0;
//        while (n < 10) {
//            System.out.println("Hello World!");
//        }

//        int n = 0;
        // This while loop never runs because prior to entering the body of while loop
        // java checks the condition and if it's false then it will not even enter the body
//        while (n > 10) {
//            System.out.println("Hello World!");
//        }
//        System.err.println("If this is printed, then your loop has never run!");

        int n = 0;
        while (n < 10) { // 10 < 10 -> false and this is when it exits the loop
            System.out.println("Hello World!");
            n++; // n = n + 1 -> post increment
        }

        //Task
        // We need to get an input from the user and it can be any number
        // except when user enters number 10, then we exit the loop
        // In this case we do not know the number of iterations to be executed

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number: " +
                "(but if you enter 10 we will stop asking for an input).");

        int a = scanner.nextInt();
        int count = 0;
        while (a != 10) {
            System.out.println("Please enter another number: ");
            count++;
            a = scanner.nextInt();
        }

        System.out.println("Congrats! You have entered 10!");
        System.out.println("You have entered " + count + " different numbers before you entered 10.");
    }

}
