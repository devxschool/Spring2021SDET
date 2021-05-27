package char_string_methods;

public class RecapStringMethods {

    public static void main(String[] args){

        //1 2 3 4 5
        //0 1 2 3 4

        String str = " $Virginia % Beach";

        String originalString = "abcde"; //s.length = 5 -> middle is = 2.5
        System.out.println("The middle char when odd length: "+originalString.charAt(originalString.length()/2));
        String firstPart = originalString.substring(0, 3);
        String secondPart = originalString.substring(originalString.length()-2); // "de"
        String rearrangedString = secondPart+firstPart;
        System.out.println("The re arranged string: " + rearrangedString); // deabc

        String b = "abcd";
        System.out.println("The middle char when even length: "+b.charAt(b.length()/2));
        int indexOfB = b.indexOf("b");
        System.out.println("Index of char 'b' is: " + indexOfB);

        String quote = "The most successful successful successful people are the ones who keeps trying without giving up!";
        int indexOfSuccessWord = quote.indexOf("successful");
        System.out.println("The index of 'successful' is: " + indexOfSuccessWord);
        int indexOfLastSuccessfulWord = quote.lastIndexOf("successful");
        System.out.println("The last index of 'successful' is: " + indexOfLastSuccessfulWord);
        int indexOfMiddleSuccessfulWord = quote.indexOf("successful", 10);
        System.out.println("The index of middle 'successful' is: " + indexOfMiddleSuccessfulWord);

        String c = "abcdef";
        System.out.println("The middle char when even length of 6 chars: "+c.charAt(c.length()/2-1));

        int len = str.length();

        System.out.println("The length is: " + len/2);
        System.out.println("The char in the middle is: " + str.charAt(len/2));


    }
}
