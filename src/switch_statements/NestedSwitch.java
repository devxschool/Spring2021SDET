package switch_statements;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {

        System.out.println("Are you invited to this wedding? Please type 'Yes' or 'No'");
        String status = new Scanner(System.in).next().toLowerCase();// all the characters will be converted to lower case
        System.out.println(status);

        System.out.println("Please enter your name: ");
        String name = new Scanner(System.in).next().toUpperCase(); // all the characters will be converted to upper case
        System.out.println(name);

        switch (status){
            case "yes":
                switch (name){
                    case "ELINA": case "EDISA": case "AIZADA": case "ANNA":
                        System.out.println("Welcome to the amazing wedding!");
                        break;
                    default:
                        System.out.println("You are not on the list, please contact admin!");
                        break;
                }
                break;
            case "no":
                System.out.println("Unfortunately you will first have to get in the list!");
                break;

            default:
                System.out.println("VIP");
        }
    }
}
