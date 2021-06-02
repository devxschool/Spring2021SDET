import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        System.out.println("Please enter your name: ");
        String name = "Baha";
        sayHello("Bakai");

        System.out.println(addTwoNumbers(1,2));
        System.out.println(addTwoNumbers(4,2));
        System.out.println(addTwoNumbers(1,5));
        System.out.println(addTwoNumbers(8,2));

    }

    public static void sayHello(String name){

        System.out.println("Hello "+name);
    }

    public static int addTwoNumbers(int num1, int num2){

        return num1 + num2;

    }


    // turnLightOn
    /*
    if(personIsMoving){
        Prepare to turn the light on
        Now turn on the light
        }
    If(time == 6:00PM){
        Prepare to turn on the light
        Now turn on the light
        }

    If(roomIsTooDark){
        Prepare to turn on the light
        Now turn on the light
        }

    EX: calculating bonuses for employees
        employee1{
        salary;
        int bonusPercent1 = 6;
        int bonusPercent2 = 7;
        int bonusPercent3 = 10;
        double bonus = salary * bonusPer1/100;
        }

        employee2{
        salary;
        yearsOfEmployment; >2
        int bonusPercent1 = 6;
        yearsOfEmployment; >3
        int bonusPercent2 = 7;
        yearsOfEmployment; >=5
        int bonusPercent3 = 10;
        double bonus = salary * bonusPer1/100;
        }

        employee3{
        salary;
        int bonusPercent1 = 6;
        int bonusPercent2 = 7;
        int bonusPercent3 = 10;
        double bonus = salary * bonusPer1/100;
        }
     */
}
