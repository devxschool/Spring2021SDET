package loops;

public class DoWhileLoop {

    public static void main(String[] args) {

        //Do while loop will run at least once before it checks the condition
        // and after executing once it checks the condition before running again

        int n = 0;

        do {

            System.out.println(++n + ": Hello world!");

        } while (n < 5);

    }
}
