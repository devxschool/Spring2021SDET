package oop.inheritance.animal;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    public void run(){
        System.out.println("Animal runs!");
    }

    protected void eat(){
        System.out.println("Animal eats");
    }
}

class Cat extends Animal{

    public void run(){
        System.out.println("Cat runs!");
    }

    public void catSleeps(){
        System.out.println("Cat sleeps!");
    }

    public static void main(String[] args) {

        // methods that are available to execute are defined by the dataType [reference type] of the object
        // but methods to execute are defined by the object during the run time
        Animal cat = new Cat();
        cat.run();
        cat.eat();

        ((Cat)cat).catSleeps();
    }
}
