package methods;

public class Methods2 {

    public static void main(String[] args) {

        int integer1 = 1;
        int integer2 = 3;
        System.out.println(sumOfTwoNumbers(integer1, integer2));
        System.out.println(integer1+integer2);


    }

    // create method that adds 2 integers and return their sum as integer
    public static byte sumOfTwoNumbers(int num1, int num2){

        int sum = num1 + num2;
        return (byte) sum;

    }
}
