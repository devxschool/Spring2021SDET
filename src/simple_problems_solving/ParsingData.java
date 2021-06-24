package simple_problems_solving;

public class ParsingData {

    public static void main(String[] args) {

        String s = "3";
        System.out.println(4 + s);

        // parseInt() method is used
        int a = Integer.parseInt(s);
        System.out.println(4 + a);

        char c = '2';
        // if we add char to int then jvm will take the decimal value of that char from
        // ASCII table and performs the operation
        System.out.println(c + 1);
        // parsing character to int by using getNumericValue() method of Character class
        int x = Character.getNumericValue(c);
        System.out.println(x + 3);
        // parsing char to String by using toString() method and then parsing that
        // String to int by using parseInt() method
        int y = Integer.parseInt(Character.toString(c));
        System.out.println(y + 7);
        System.out.println(x + y);
    }
}
