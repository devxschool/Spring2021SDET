package char_string_methods;

public class ParseMethods {

    public static void main(String[] args) {

        int x = Integer.parseInt("12");
        double c = Double.parseDouble("12");
        int b = Integer.parseInt("100",2);

        System.out.println(x);
        System.out.println(c);
        System.out.println("11"+4); //114, 15
        System.out.println("11"+"4"); //114
        System.out.println("abc"+2); //abc2
        System.out.println("");

        String str = "11";
        str = str + (4 + 2);
        System.out.println(str); //


    }
}
