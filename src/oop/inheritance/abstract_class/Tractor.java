package oop.inheritance.abstract_class;

public abstract class Tractor extends RandomNonAbstractClass{

    @Override
    public void randomMethod(){
        System.out.println("Overridden random method");
    }

    public int add(int a){
        return 4 + a;
    }

    public static void main(String[] args) {

        RandomNonAbstractClass randomNonAbstractClass = new RandomNonAbstractClass();
        randomNonAbstractClass.randomMethod();

        System.out.println(randomNonAbstractClass.add(3));
        // this casting is going to throw an ClassCastException error because we cannot
        // instantiate an abstract class directly
        //System.out.println("Downcast try: " +((Tractor)randomNonAbstractClass).add(3));

        System.out.println("I have extended a non abstract class");
    }
}
