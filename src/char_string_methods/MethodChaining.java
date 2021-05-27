package char_string_methods;

public class MethodChaining {

    public static void main(String[] args) {

        String originalString = " MotorCYcle ";
        System.out.println(originalString);
        System.out.println(originalString.length());
        String configuredString = originalString
                .toLowerCase()
                .trim()
                .substring(originalString.length()-6);

        System.out.println(originalString.length()-6);

        System.out.println(configuredString);

        originalString = originalString.substring(4);
        System.out.println(originalString);
    }
}
