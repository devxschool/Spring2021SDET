package methods;

public class StaticVsNonStatic {

    // A static method is a method that belongs to a class,
    // but it does not belong to an instance of that class and
    // this method can be called without the instance or object of that class

    // Non static methods are also called instance methods, they can only be called from a reference to an object.
    // Which ever class the method is defined in you will have to create an object of that class.


    public static void main(String[] args) {

        System.out.println(staticAdd(1,2));

        // Scanner scan = new Scanner(System.in);
        StaticVsNonStatic ourInstance = new StaticVsNonStatic();

        System.out.println(ourInstance.nonStaticAdd(3,2));
    }

    public int nonStaticAdd(int a, int b){
        return a + b;
    }

    public static int staticAdd(int a, int b){
        return a + b;
    }


}
