package scanner_increment_decrement;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Please enter a decimal value:");
        double inputDouble = scanner.nextDouble();
        System.out.println(inputDouble);
        scanner.nextLine();

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: "+ name);

//        char firstLetterOfTheName = name.charAt(0);
//        System.out.println("The character at 1 index is: "+ firstLetterOfTheName);

        // 0-11 -- [12 - 45] -- [46 - 60]not eligible -- [60 - 90] -- 91 not eligible

        if(age >= 12 && age <= 45 || age >= 60 && age <= 90){
            System.out.println("Yay! You are eligible to get vaccinated!");
        } else if (age >= 91){
            System.out.println("You are eligible but you need 10 shots!");
        } else {
            System.out.println("Sorry! You are not eligible for vaccination!");
        }
    }
}
