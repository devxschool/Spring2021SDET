package char_string_methods;
import java.util.*;

public class CharMethods {

    public static void main(String[] args) {

        char letter = 'a';
        System.out.println("Is our char a letter? "+Character.isDigit(letter));

        char number = '4';
        System.out.println("Is our char a digit? "+Character.isDigit(number));

        System.out.println("Is it a letter or digit?"+Character.isLetterOrDigit('$'));

        Character ch = new Character('a');

        String str = "m";

        String str1 = "M";

        String str3 = "my name";

        String str2 = new String("My name"); // it's an object and we used constructor to create this object
        String str4 = new String("My name");

        System.out.println("'==' output -> " + (str2 == str4));
        System.out.println("equals() output -> " + (str2.equals(str4)));



        System.out.println(str == str1);
        System.out.println(str1 == str2);
        System.out.println(str.equals(str2));
        System.out.println(str.length() == str2.length());
        System.out.println(str1.compareTo(str));

        System.out.println("Please enter a credit card number: ");
        String creditCard = new Scanner(System.in).next(); //indexes of last 3 chars: ex: 123456 ->
        // index of 4 is creditCard.length()-3, 5->creditCard.length()-2, 6->creditCard.length()-1
        // substring() -> it returns us part of a string
        // EX: String a = "abcd" -> a.substring(2) or a.substring(2,5)
        String name = "Kosta"; //kostA
        int count = 0;

        if(creditCard.length() == 6){

            if(Character.isDigit(creditCard.charAt(0))){
                count++;
            }if(Character.isDigit(creditCard.charAt(1))){
                count++;
            }if(Character.isDigit(creditCard.charAt(2))){
                count++;
            }if(Character.isDigit(creditCard.charAt(3))){
                count++;
            }if(Character.isDigit(creditCard.charAt(4))){
                count++;
            }if(Character.isDigit(creditCard.charAt(5))){
                count++;
            }

            if(!name.isEmpty() && name.equalsIgnoreCase("kosta") && count == 6){

                // financial institute ex: bofa, chase, fifththird.
                // "456" -> chase
                // "123" -> bofa
                // "789" -> 53th bank

                String bank = creditCard.substring(creditCard.length()-3);

                switch (bank){
                    case "456":
                        System.out.println("This is a Chase customer. Yay! You get %5 cash back.");
                        break;
                    case "123":
                        System.out.println("This is a Bofa customer. Yay! You get %3 cash back.");
                        break;
                    case "789":
                        System.out.println("This is a 53rd bank customer. Yay! You get %10 discount.");
                        break;
                    default:
                        System.out.println("This bank is not our customer!");
                }

            }
            else {
                System.out.println("Please try a valid card or the right person.");
            }

        }
        else {
            System.out.println("Please enter a valid credit card number!");
        }
    }
}
