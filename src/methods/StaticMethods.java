package methods;

public class StaticMethods {

    public static int subtractFromStaticClass(int bigger, int smaller){

        return bigger - smaller;

    }

    private static int sumOfThreeNums(int a, int b, int c){
        return a+b+c;
    }

    protected static int sumOfTwoNums(int a, int b){
        return a + b;
    }
}
