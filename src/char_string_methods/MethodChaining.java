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

        System.out.println(originalString.substring(originalString.length()-6));
        System.out.println(originalString.substring(6));

        System.out.println(configuredString);

        String str = "Chicago";

        System.out.println(str.substring(4));
        System.out.println(str.substring(4,str.length()));
        System.out.println(str.substring(str.length()-3));
// 7-3
        int indexNumberOfStr = str.length() - 3;
        System.out.println(indexNumberOfStr);

        System.out.println(str.substring(indexNumberOfStr));
        System.out.println(str.substring(str.indexOf("a")));
    }
}
