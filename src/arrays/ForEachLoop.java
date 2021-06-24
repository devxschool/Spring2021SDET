package arrays;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        String[] names = {"Aizada", "Aisulu", "Kosta", "Dinara", "Lukas", "Tim", "Milda", "Elina", "Bermet"};

        for (String var : names) {
            System.out.println("Welcome " + var);
        }

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println();

        //2D array of characters
        char [][] charArr = {{'a', 'b', 'c'},{'d', 'e', 'f'}}; //charArr[2][3]

        //3D array of integers
        int [][][] numbers = {{{10, 11, 12}, {13, 14, 15}, {16, 17, 18}}}; //number[1][3][3]
        System.out.println("The element at [0][1][1] is: " + numbers[0][1][1]);
        System.out.println();
        //System.out.println(numbers[0][1][1]);

        // number of iterations: 1
        for (int i = 0; i < numbers.length; i++){
            // number of iterations: 3
            for (int j = 0; j < numbers[i].length; j++){
                // number of iterations: 9
                for (int k = 0; k < numbers[i][j].length; k++){
                    System.out.print(numbers[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("The length of the main array: " + numbers.length);
        System.out.println("The length of the inner array: " + numbers[0].length);
        System.out.println("The length of the inner inner array: " + numbers[0][0].length);

    }
}
