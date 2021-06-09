package loops;

public class ReverseTheInteger {

    public static void main(String[] args) {

        // Task
        // given any integer, reverse it and print it out
        // EX: 123 -> expected output: 321

        // Modulus [%] EX: 5 / 2 = 2.5 -> 5 % 2 = 1;
        // EX: 9 % 2 = 1 [2 * 2 * 2 = 8] -> 9 - 8 = 1;

        int i = 12345;
        int x = 0;
        while (i > 0){

            x = x * 10; // 321
            x = x + i % 10; // 123 % 10 = remainder is 3;
            i = i / 10; // 123 / 10 = 12 to get the integer only

        }

        System.out.println(x);
    }
}
