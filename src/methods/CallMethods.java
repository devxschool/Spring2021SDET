package methods;

public class CallMethods {

    public static void main(String[] args) {
        // Scanner scan = new Scanner();
        NonStaticMethods1 nonStaticMethods = new NonStaticMethods1();
        int a = nonStaticMethods.subtractFromNonStatic(3,1);
        System.out.println(a);

        int b = StaticMethods.subtractFromStaticClass(5,2);
        System.out.println(b);

        System.out.println(StaticMethods.sumOfTwoNums(4,6));
    }
}
