package nested_if_else;

public class String_methods {

    public static void main(String[] args) {

        String city = "Chicagoland";
        //length() method
        System.out.println(city.length());
        int cityLen = city.length();
        System.out.println("The length of string is: " + cityLen);

        //charAt(index)
        //we want to get letter 'g' from "Chicagoland"
        System.out.println("The character at index 5 is: " + city.charAt(5));

        //we want to get the last character of "Chicagoland"
        System.out.println("The last character is: " + city.charAt(10));
        System.out.println("The last character is: " + city.charAt(city.length()-1));
        System.out.println("The last character is: " + city.charAt(cityLen-1));
        //since string index starts at 0, the first character index is always 0
        System.out.println("The first character is: " + city.charAt(0));

        //substring() method returns us the desired part of the string ->
        // substring(starting index) or substring(starting index, ending index)
        String sbstr = city.substring(7);
        System.out.println(sbstr); //return "land"

        String partOfString = city.substring(3,7);
        System.out.println(partOfString); //return "cago"


    }
}
