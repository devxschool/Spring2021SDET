package nested_if_else;

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {

        Random rand = new Random();

        int luckyNumber = 3;

        int randomNum = rand.nextInt(5);
        System.out.println("The random number is: " + randomNum);

        if(randomNum == luckyNumber){
            System.out.println("Lucky random number is: " + randomNum);
        }

    }
}
