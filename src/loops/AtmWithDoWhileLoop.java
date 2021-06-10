package loops;

import java.util.Scanner;

public class AtmWithDoWhileLoop {

    //Task
    // ATM [Cash dispenser]: when we use the ATM it requires us to insert our debit card first
    // and asks for our pin, and only
    // then you can perform transactions and once complete with your first transaction
    // ATM asks if you want to do another transaction and if yes then it will ask for the type of transaction
    // that you want to perform

    //Approach:
    // Welcome the customer in the Main method
    // Ask for card insertion
    // Require pin
    // Ask for type of transaction
    // Call the transaction type method

    static double balance = 1741.34;

    public static void main(String[] args) {

        String welcome = "Welcome to DevX bank. PLease insert your card to continue: ";
        System.out.println(welcome);
        Scanner scan = new Scanner(System.in);

        int pin = 1234;
        int enteredPin;

        int count = 0;
        do {
            if(count == 3){
                System.err.println("Your card is blocked!");
                Runtime.getRuntime().exit(3);
            }
            System.out.println("Please enter pin: ");
            enteredPin = scan.nextInt();
            count++;
            if(enteredPin == pin){
                System.out.println("Please choose transaction type: \n" +
                        "1. Withdrawal \n" +
                        "2. Deposit");
                int option = scan.nextInt();
                switch (option){
                    case 1:
                        System.out.println("Your current balance is: "+balance);
                        System.out.println("Please enter the amount: ");
                        System.out.println("Your available balance: "+withdrawMoney(scan.nextInt()));
                        break;
                    case 2:
                        System.out.println("Your current balance is: "+balance);
                        System.out.println("Please enter the amount: ");
                        System.out.println("Your available balance: "+depositMoney(scan.nextInt()));
                        break;
                    default:
                        System.out.println("Please select an available option!");
                }
            }
        } while (enteredPin != pin);

    }

    private static double withdrawMoney(int amount){

        return balance - amount;
    }

    private static double depositMoney(int depositAmount){

        return balance + depositAmount;
    }

}
