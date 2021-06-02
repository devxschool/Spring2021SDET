package string_builder;

public class ReverseMethod_StringBuilder {

    public static void main(String[] args) {

        // reverse -> changing the order back to front
        String a = "abc";
        System.out.println(a);

        a = String.valueOf(a.charAt(2))+a.charAt(1)+a.charAt(0);

        char c = 'd';
        String s = String.valueOf(c);
        System.out.println(a);

        StringBuilder sb = new StringBuilder("abc");
        sb.reverse();
        System.out.println("This is string builder reverse output: "+sb);
        sb.reverse();
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);


    }
}
