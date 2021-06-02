package string_builder;

public class StringBuilderVsString {

    public static void main(String[] args) {

        //String is immutable, once created a string object we can not change it. We can modify it by updating
        //the object but it will create another object to update the existing string object.

        String str = "San Francisco"; // San De Francisco
        str = str.substring(str.indexOf("S"),str.lastIndexOf("s")) + str.substring(str.length()-1);
        System.out.println("After removing \"sc\": "+str);
        StringBuilder sb = new StringBuilder("San Francisco");//San De Francittsco
        sb.delete(sb.indexOf("s"), sb.indexOf("o"));
        System.out.println("After removing 'sc' from string builder: "+sb);
//        System.out.println(sb);
//        sb.insert(4, "De ");
//        System.out.println(sb);
//        sb.insert(13, "tt");
//        System.out.println(sb);
        //System.out.println(str);
        System.out.println(Integer.toHexString(str.hashCode()));

        str = str + " is a great city!";
        System.out.println(Integer.toHexString(str.hashCode()));
        str = str.concat(" Wohoo!");
        System.out.println(str);
        System.out.println(Integer.toHexString(str.hashCode()));

        str += " And I love it!";
        System.out.println(str);
        System.out.println(Integer.toHexString(str.hashCode()));
    }
}
