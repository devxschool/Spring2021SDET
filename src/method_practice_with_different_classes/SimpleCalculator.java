package method_practice_with_different_classes;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Messages.printOptions();
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        if(4 < option || option < 1){ // 10 > x > 3
            System.err.println("Please enter numbers between 1 and 4 only!");
        }else {
            switch (option){
                case 1:
                    Messages.printMsg();
                    double res = StaticSum.sum(scan.nextInt(),scan.nextInt());
                    Messages.printResMsg(res);
                    break;
                case 2:
                    Messages.printMsg();
                    double res1 = StaticSubtract.subtract(scan.nextInt(),scan.nextInt());
                    Messages.printResMsg(res1);
                    break;
                case 3:
                    NonStaticMultiply nonStaticMultiply = new NonStaticMultiply();
                    Messages.printMsg();
                    double res2 = nonStaticMultiply.multiply(scan.nextInt(),scan.nextInt());
                    Messages.printResMsg(res2);
                    break;
                default:
                    NonStaticDivision nonStaticDivision = new NonStaticDivision();
                    Messages.printMsg();
                    double res3 = nonStaticDivision.division(scan.nextInt(),scan.nextInt());
                    Messages.printResMsg(res3);
                    break;
            }
        }
    }
}
