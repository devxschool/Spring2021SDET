package char_string_methods;

public class CharToStringAndStringToChar {

    public static void main(String[] args) {

        String s = "ab";
        System.out.println("Original string: "+s);

        char c = s.charAt(1);
        System.out.println("Char at index 1: "+c);

        // Character to String
        String str = String.valueOf(c);
        System.out.println("Char converted to string: "+str);
        // Character to String
        String str1 = Character.toString(c);
        System.out.println("Char converted to string:(Character.toString) "+str1);

        String str2 = c+"";
    }
}
