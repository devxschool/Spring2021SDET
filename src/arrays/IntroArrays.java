package arrays;

import java.util.Arrays;

public class IntroArrays {

    public static void main(String[] args) {

        String[] names = new String[5];
        // Default value for String type arrays is "null"
        names[0] = "Elina Yapparova";
        names[1] = "Iskander Nurmatov";
        names[3] = "Noilya Mese";
        names[4] = "Viktoria Luchka";

//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println(Arrays.toString(names));
        // Default value for empty indexes will be 0 for int type arrays
        int[] arr = new int[]{12,2,3,21,42,77,83};
        int len = arr.length;
        System.out.println("The length of the array is: " + len);
        byte n = (byte) arr[3];
        System.out.println("the number at index 3 is: " + n);
        System.out.println("The last element of the array: " + arr[arr.length-2]);
        System.out.println("Element at index 5 is: " + arr[5]);

        double[] doubleArr = new double[4];
        doubleArr[0] = 23;
        doubleArr[2] = 12.53;
        doubleArr[3] = 1.67;
        //By default empty indexes will get 0.0 for double type arrays
        System.out.println(doubleArr[1]);
        System.out.println(Arrays.toString(doubleArr));

        boolean[] boolArr = new boolean[4];
        boolean bool = true;
        boolArr[3] = bool;
        boolArr[1] = false;
        boolArr[2] = false;
        // Default value for boolean type array is 'false'
        System.out.println(Arrays.toString(boolArr));

        int[] intArr = new int[2];
        intArr[0] = 3;
        // at index 1 we are assigning the value of returned int from a method call
        intArr[1] = testMethod(intArr[0]);

        System.out.println(intArr[1]);


    }

    public static int testMethod(int n){
        return n - 1;
    }
}
