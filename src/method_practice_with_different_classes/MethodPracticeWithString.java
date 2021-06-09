package method_practice_with_different_classes;

public class MethodPracticeWithString {



    // Task:
    // String str = " San Frrancisco "; -> "San Francisco"

    public static void main(String[] args) {

        String str = " San Frrancisco ";

        MethodPracticeWithString mpws = new MethodPracticeWithString();
        System.out.println(mpws.modifyString(str));
    }

    String modifyString(String s) {

        String outputString = s
                .trim()
                .replaceFirst("r", "");
//        StringBuilder sb = new StringBuilder(outputString);
//        outputString = sb.deleteCharAt(sb.indexOf("r")).toString();
//        outputString = outputString.substring(0, outputString.indexOf("r")) +
//                outputString.substring(outputString.lastIndexOf(("r")));

        return outputString;
    }

    static void sayHello(){
        System.out.println("Hello!");
    }

    int a = 6;
    byte x = (byte) a; //explicit -> where we have to manually convert

    int b = x; //implicit -> automatic data type conversion

}
