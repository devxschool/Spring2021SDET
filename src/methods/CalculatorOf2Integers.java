package methods;

import java.util.Scanner;

public class CalculatorOf2Integers {


    /*
    - Print out what is the purpose of this class [EX: Please select an option to perform calculation:
    - 1. Add 2 numbers
    - 2. Subtract 2 numbers
    - 3. Multiply 2 numbers
    - 4. Divide 2 numbers

    - Users can only input numbers from 1-4
    - switch(){
        case 1:
            sum(int 1, int 2);
            break;
        ...
        default:
            sout("please enter numbers from 1 to 4");
        }
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String options = "Please select an option to perform calculation: [Input numbers 1-4] \n" +
                "    -> 1. Add 2 numbers \n" +
                "    -> 2. Subtract 2 numbers\n" +
                "    -> 3. Multiply 2 numbers\n" +
                "    -> 4. Divide 2 numbers";

        System.out.println(options);
        String option = scan.next();
        if(!option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4")){
            System.err.println("You can only select the above options!");
        }
        else {
            System.out.println("Now please enter 2 integers for this calculation.");

            System.out.println("Enter the first number: ");
            int int1 = scan.nextInt();

            System.out.println("Enter the second number: ");
            int int2 = scan.nextInt();

            switch (option){

                case "1":
                    //call method addTwoNums(int num1, int num2)
                    System.out.println(int1 + " + " + int2 + " = " + addTwoNums(int1, int2));
                    break;
                case "2":
                    System.out.println(int1 + " - " + int2 + " = " + subtractTwoNumbers(int1, int2));
                    break;
                case "3":
                    System.out.println(int1 + " * " + int2 + " = " + multiplyTwoNumbers(int1, int2));
                    break;
                case "4":
                    System.out.println(int1 + " / " + int2 + " = " + divideTwoNumbers(int1, int2));
                    break;
                default:
                    System.out.println("Please input numbers between 1-4.");
            }

        }


    }

    public static int addTwoNums(int num1, int num2){

        int sum = num1 + num2;
        return sum;
    }

    public static int subtractTwoNumbers(int num1, int num2){

        return num1 - num2;
    }

    public static int multiplyTwoNumbers(int num1, int num2){

        return num1 * num2;
    }

    public static double divideTwoNumbers(int num1, int num2){

        return (double) num1 / (double) num2;
    }

}
