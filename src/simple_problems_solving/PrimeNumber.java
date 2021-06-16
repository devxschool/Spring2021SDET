package simple_problems_solving;

import java.util.Scanner;

public class PrimeNumber {

    // What is a prime number?
    // Number that can only be divided by 1 or by itself with the remainder of 0.
    // A prime number (or a prime) is a natural number greater
    // than 1 that is not a product of two smaller natural numbers

    // Time complexity or Big O notation of single for loop is O(n)
    // Time complexity of Nested for loop (2 loops) it is O(n^2) -> known as worst

    //TASK:
    //1 inout form user any int
    // write a method which will print out "It's prime" if it is a prime number
    // print out "not a prime" if it is not a prime number

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not: ");
        int n = scanner.nextInt();
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(primeNumber.isPrime(n));
    }

    protected boolean isPrime(int n) {

        // if the number is less than or equal to 1 then it is not a prime
        if(n <= 1){
            return false;
        }
        // we need to only check the number up to half of the
        // given number because if any number that is bigger than the half
        // of the number cannot be product of given number to be multiplied by other number
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
