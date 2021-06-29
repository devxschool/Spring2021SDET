package arrays;

import java.util.Arrays;

public class CopyingArrays {

    public static void main(String[] args) {
        // Assigning the existing array to new array
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbersCopy = numbers;

        System.out.println("Original numbers: " + Arrays.toString(numbers));
        System.out.println("Copying by using variable assignment: " + Arrays.toString(numbersCopy));

        // Create a new array of the same length and copy each element.
        int[] numbersCopyEachElement = new int[numbers.length];
        int i = 0;
        for (int n : numbers) {
            numbersCopyEachElement[i++] = n;
        }

        System.out.println("After copying each element individually: " + Arrays.toString(numbersCopyEachElement));

        // Use the clone method of the array. Clone methods create a new array of the same size.
        // int[] numbers = {1, 2, 3, 4, 5};
        int[] clonedNumbers = numbers.clone();

        System.out.println("Cloned array: " + Arrays.toString(clonedNumbers));

        // Use System.arraycopy() method. arraycopy can be used to copy a subset of an array.
        // int[] numbers = {1, 2, 3, 4, 5};
        int[] arrayCopyNumbers = new int[4];

        System.arraycopy(numbers, 0, arrayCopyNumbers, 1, 3);
        System.out.println("Array after using arraycopy() method: " + Arrays.toString(arrayCopyNumbers));


        // Let's try to update the value of third element from numbers[] array and see which ones will get updated:
        // int[] numbers = {1, 2, 3, 4, 5};
        numbers[2] = 7;

        System.out.println("After updating third element to 7 original: " + Arrays.toString(numbers));
        System.out.println("After updating third element to 7 variable assignment: " + Arrays.toString(numbersCopy));
        System.out.println("After updating third element to 7 individually copying elements to new array: " + Arrays.toString(numbersCopyEachElement));
        System.out.println("After updating third element to 7 cloned array: " + Arrays.toString(clonedNumbers));
        System.out.println("After updating third element to 7 arraycopy method: " + Arrays.toString(arrayCopyNumbers));

    }
}
