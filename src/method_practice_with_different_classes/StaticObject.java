package method_practice_with_different_classes;

import java.util.Scanner;

public class StaticObject {

    static StaticObject justObject = new StaticObject();

    public static void main(String[] args) {

        justObject.sayHello("Baha");
        System.out.println(justObject.addLastName("Baha"));
    }

    void sayHello(String name){
        System.out.println("Hello " + name);
    }

    String addLastName(String firstName){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your last name: ");
        return firstName + " " + scan.nextLine();
    }
}
