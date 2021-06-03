package methods;

import java.util.Scanner;

public class WithoutMethods {

    public static void main(String[] args) {


        // calculate the tax of employees by their marital status
        // if married then tax %5
        // if not married then tax %25

        boolean isMarried = new Scanner(System.in).nextBoolean();

        int salary = new Scanner(System.in).nextInt();

        //empl1
        calculateTax(isMarried, salary);

        //empl2
        calculateTax(isMarried, salary);

        //empl3
        calculateTax(isMarried, salary);

    }

    public static void calculateTax(boolean isMarriedOrNot, int salaryOfEmpl){
        if(isMarriedOrNot) {
            System.out.println(salaryOfEmpl * 7/100);
        }else {
            System.out.println(salaryOfEmpl * 25/100);
        }
    }
}
