package loops;

public class NestedWhileLoop {

    public static void main(String[] args) {

        int n = 1;

        while (n <= 3){ // outer loop

            int x = 4;
            while (x <= 6){ // inner loop
                System.out.println(n + " : " + x);
                x++;
            }
            n++;

        }
    }
}
