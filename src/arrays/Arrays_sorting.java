package arrays;

import java.util.Arrays;

public class Arrays_sorting {

    public static void main(String[] args) {

        int[] myArray = {56, 787, 89, 54, 23, 21, 5, 92, 6, 0, 1};

        Arrays.sort(myArray);
        System.out.println("Sorted: " + Arrays.toString(myArray));

        String[] myStr = new String[4];
        myStr[0] = "home";
        myStr[1] = "2very";
        myStr[2] = "aweet";
        myStr[3] = "awlai";

        int lenMyStr = myStr.length;

        Arrays.sort(myStr);
        System.out.println(Arrays.toString(myStr));

        String[] reversedMyStr = new String[lenMyStr];
        int count = 0;
        for (int i = lenMyStr -1; i >= 0; i--){
            reversedMyStr[count] = myStr[i];
            count++;
        }

        System.out.println(Arrays.toString(reversedMyStr));
    }
}
