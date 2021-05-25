package switch_statements;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {

        System.out.println("Are you invited to this wedding? Please type 'Yes' or 'No'");
        String status = new Scanner(System.in).next().toLowerCase();// all the characters will be converted to lower case

        System.out.println("Please enter your name: ");
        String name = new Scanner(System.in).next().toUpperCase(); // all the characters will be converted to upper case

        System.out.println("Please enter your age: ");
        int age = new Scanner(System.in).nextInt();

        switch (status){
            case "yes":
                switch (name) {
                    case "ELINA", "EDISA", "AIZADA", "ANNA":
                        System.out.println("Welcome to the amazing wedding!");
                        if(age >= 21){
                            System.out.println("You can enjoy this evening by the bar!");

                            System.out.println("Please enter the type of beverage that contains alcohol. Ex: beer, wine, shots.");
                            String beverageType = new Scanner(System.in).next();
                            beverageType = beverageType.toLowerCase();

                            switch (beverageType){
                                case "beer":
                                    System.out.println("Good choice! Here is list of beers: Stella artois, Nashe, Arpa, Heineken, Bud, Miller");
                                    break;
                                case "wine":
                                    System.out.println("Good choice! Chardonnay, Black Eyes, Red rose");
                                    break;
                                case "shots":
                                    System.out.println("Way to go! Tequila, Vodka, Kamikadze");
                                    break;
                                default:
                                    System.out.println("Sorry. We only have limited menu at this bar.");
                            }
                            break;
                        }else {
                            System.out.println("Please get yourself a juice!");
                        }
                    break;
                default:
                    System.out.println("You are not on the list, please contact admin!");
                }
                break;
            case "no":
                System.out.println("Unfortunately you will first have to get in the list!");
                break;

            default:
                System.out.println("VIP");
        }
        System.out.println("Get home safe! Watch your step!");
    }
}
