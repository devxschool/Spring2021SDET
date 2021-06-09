package loops;

import java.util.Scanner;

public class RepetitionPractice {

    public static void main(String[] args) {

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

        //Task
        // get 5 numbers from the user and calculate the average and print out the result
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        double aver = (a+b+c+d+e)/5;

        System.out.println(aver);
    }
}
