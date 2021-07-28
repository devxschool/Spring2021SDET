package oop.inheritance.animal;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    /*
        1. Method Overloading in Java – This is an example of compile time (or static polymorphism)
        2. Method Overriding in Java – This is an example of runtime time (or dynamic polymorphism)
        3. Types of Polymorphism – Runtime and compile time – This is our next tutorial where we
        have covered the types of polymorphism in detail.
     */

//    public void run(){
//        System.out.println("Animal runs!");
//    }

    public String s = "Parent class";

    public void run(int a){
        System.out.println("Animal has ran "+ a);
    }

    public void run(int b, int c){
        System.out.println("Animal has ran double distance " + (b + c));
    }

    protected void eat(){
        System.out.println("Animal eats");
    }

    public Animal hunt(){
        return new Animal();
    }

}

class Cat extends Animal{

    /*
        Covariant return -> means that when one overrides a method,
        the return type of the overriding method is allowed to be a
        subtype of the overridden method's return type.
     */
    public Animal hunt(){
        return new Cat();
    }

    public static void main(String[] args) {

        // methods that are available to execute are defined by the dataType [reference type] of the object
        // but methods to execute are defined by the object during the run time
        Animal cat = new Cat();
        //cat.run();
        cat.eat();
        cat.run(5);
        cat.run(2,7);

        System.out.println(cat.s);

        Cat catObj = new Cat();
        System.out.println(catObj.s);

    }
}
