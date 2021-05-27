package char_string_methods;

public class MethodChaining {

    public static void main(String[] args) {

        String originalString = " MotorCYcle ";
        System.out.println(originalString);
        System.out.println(originalString.length());
        String configuredString = originalString
                .toLowerCase()
                .trim();

        System.out.println(configuredString.substring(configuredString.length()-2));
        // when we pass string.length()-x, it will start truncating(substring) from the end of given string.

        System.out.println(originalString.substring(originalString.length()-6));
        System.out.println(originalString.substring(6));

        System.out.println(configuredString);

    }
}
