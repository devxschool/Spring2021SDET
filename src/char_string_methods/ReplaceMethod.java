package char_string_methods;

public class ReplaceMethod {

    public static void main(String[] args) {

        String str = "Ocean is blue, as well as sky!";
        String strAReplacedWitU = str.replace('a', 'u');
        System.out.println(str);
        System.out.println(strAReplacedWitU);
        System.out.println(str.replace("Ocean", "Eye"));

    }
}
