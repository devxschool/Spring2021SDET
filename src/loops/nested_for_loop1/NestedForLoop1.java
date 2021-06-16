package loops.nested_for_loop1;

public class NestedForLoop1 {

    public static void main(String[] args) {

        //NOTE: for every iteration of outer loop, the inner loop will iterate
        // as many times as it satisfies the condition of inner loop

        for (int i = 1; i <= 3; i++){
            System.out.println("This is outer loop: " + i);

            for (int j = 1; j <= 4; j++){

                //System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
