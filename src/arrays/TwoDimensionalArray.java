package arrays;

import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] mda = new int[2][3];
        // [0][0] -> 3
        // [0][1] -> 5

        mda[0][0] = 3;
        mda[0][1] = 5;
        mda[1][0] = 7;
        mda[1][1] = 9;

        System.out.println(Arrays.toString(mda[0]));
        System.out.println(Arrays.toString(mda[1]));
        System.out.println(Arrays.deepToString(mda));


        // we are trying to create a chess board by using 2D array
        char [][] chess = new char[8][8];
        // for rows outer loop
        for (int i = 0; i < chess.length; i++){

            for (int j = 0; j < chess[i].length; j++){

                if(i % 2 == 0){
                    if(j % 2 == 0){
                        chess[i][j] = 'W';
                    }
                    else {
                        chess[i][j] = 'B';
                    }
                    System.out.print(chess[i][j]+"\t");
                }
                else {
                    if(j % 2 == 0){
                        chess[i][j] = 'B';
                    }
                    else {
                        chess[i][j] = 'W';
                    }
                    System.out.print(chess[i][j]+"\t");
                }
            }
            System.out.println();
        }


        int[][] arr = {{9, 2}, {4}, {7, 3, 6}, {10, 11, 5, 8}};
        /*
        [9  2]
        [4]
        [7  3  6]
        [10  11  5  8]
         */

        // the length of the arr in rows
        System.out.println("Length of rows: " + arr.length);
        // the length of the second row from arr
        System.out.println("The length of second element: " + arr[1].length);
        // the length of the last element of the multidimensional array
        System.out.println("The length of last sub array: " + arr[arr.length-1].length);
        // location of 7 from the above arr
        System.out.println(arr[2][0]);

        // calculate the sum of all numbers in array
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){

                sum = sum + arr[i][j];
            }
        }

        System.out.println("The sum of all elements in multidimensional array: " + sum);

    }
}
