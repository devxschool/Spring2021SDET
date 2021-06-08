package method_practice_with_different_classes;

public class Messages {

    static void printOptions(){
        String options = "Please enter one of the below options: \n" +
                "1. Sum \n" +
                "2. Subtract \n" +
                "3. Multiply \n" +
                "4. Division";
        System.out.println(options);
    }

    static void printMsg(){
        System.out.println("Please enter 2 numbers: ");
    }

    static void printResMsg(double x){
        System.out.println("Your result is: " + x);
    }
}
