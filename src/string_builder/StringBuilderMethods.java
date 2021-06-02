package string_builder;

public class StringBuilderMethods {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println("The memory location of sb before append: "+Integer.toHexString(sb.hashCode()));
        System.out.println(sb.append(" class!"));
        System.out.println("The memory location of sb after append: "+Integer.toHexString(sb.hashCode()));

        sb.deleteCharAt(1);
        System.out.println(sb);
        System.out.println("The memory location of sb after deleting a char 'e': "+Integer.toHexString(sb.hashCode()));


        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());
        sb1.append("Hi!");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        sb1.append("askbdfo;afghnaeorfnoeard;ofn");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());


        String hi = "Hi!";

        System.out.println(hi.length());



    }
}
