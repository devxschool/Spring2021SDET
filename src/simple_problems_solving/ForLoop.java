package simple_problems_solving;

public class ForLoop {

    public static void main(String[] args) {

//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);

//        for(int i = 1; i <= 5; i++){
//            System.out.println(i);
//        }
//
        int[] arr = {1,2,3,4,5};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println("Using for loop: ");

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Reverse printing:");
        for (int j = arr.length-1; j >= 0; j--){
            System.out.println(arr[j]);
        }

    }
}
