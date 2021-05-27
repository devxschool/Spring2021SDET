package char_string_methods;

public class TrimMethod {

    public static void main(String[] args) {

        // This String.trim() method removes white spaces within the given string from it's beginning and from the end.

        String str = " I love coding! ";
        String strTrimmed = str.trim(); // "I love coding!"
        System.out.println("String with removed white spaces from the end: " + strTrimmed);

        String strWithSpaceInBeginning = " Perseverance landed on Mars!";
        String strWithSpaceInBeginningTrimmed = strWithSpaceInBeginning.trim(); //"Perseverance landed on Mars!"
        System.out.println("String with removed white spaces from the beginning: " + strWithSpaceInBeginningTrimmed);
    }
}
