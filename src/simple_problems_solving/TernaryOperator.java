package simple_problems_solving;

public class TernaryOperator {

    public static void main(String[] args) {

        // Task: Convert the below if statement to ternary operator

        int num1 = 10;
        int num2 = 20;
        int res = 0;
//        if(num1 < num2){
//            res = num1 + num2;
//        }
//        else res = num1 - num2;
//
//        System.out.println(res);

        res = num1 > num2 ? num1 + num2 : num1 - num2;

        System.out.println(res);

        String weather = " raining ";

        String stateOfWeather = weather.trim().equalsIgnoreCase("Raining") ? "Yes" : "No";
        System.out.println("Is it a rainy day outside? " + stateOfWeather);

        char c = 'a';

        c = c == 'a'? '$' : '@';
        System.out.println(c);

        // BELOW THIS LINE WE ARE WORKING WITH MULTIPLE EXAMPLES NOT RELATED TO TERNARY OPERATOR

         StringBuilder sb = new StringBuilder("Kost");
         // "Kosta"
         sb.append('a');
         // "osta"
         sb.deleteCharAt(0);
         // "oshta"
         sb.insert(2, 'h');

         String s = sb.toString();
        // "os2hta"
         s = s.substring(0, 2) + "2" + s.substring(2);
        System.out.println(s);
        System.out.println("Is there a digit in string? " + isThereDigit("chic23ago"));

    }

    static String isThereDigit(String str){
        // "chic23ago"
        // Character class has a method called isDigit() -> returns true if the given char is digit;
        // String class has a method called charAt();
        boolean result = false;
        for (int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                result = true;
            }
        }
        String s = String.valueOf(result);
        return s;
    }
}
