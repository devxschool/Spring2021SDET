package oop.inheritance;

public class Engineer extends Employee{

    // onTarget or notOnTarget -> when employees of the company reach their goal annually
    // they have a chance to get a bonus at certain amount
    private boolean isOnTarget;

    // This variable also exists in parent class [Employee] and this process of having 2 variables
    // with the same name is called "hiding variables"
    public String message = "Hello Engineers!";

    public static int count = 0;


    public boolean isOnTarget() {
        return isOnTarget;
    }

    public void setOnTarget(boolean onTarget) {
        isOnTarget = onTarget;
    }

    public Engineer(int employeeNumber, String name, String DOB, String jobTitle, double salary, boolean isOnTarget){
        super(employeeNumber, name, DOB, jobTitle, salary);
        this.isOnTarget = isOnTarget;
        count++;
    }

    @Override
    public Double promote(){
        if(isOnTarget){
            return super.salary += 7000;
        }
        else {
            return (Double) super.promote();
        }
    }

    public static void staticMethod(){
        System.out.println("I am static method from Engineer class!");
    }
}
