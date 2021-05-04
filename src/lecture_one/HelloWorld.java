package lecture_one;


//                                        Interpretor Window   // 1. Windows
// Java Text File -> Java Class File ->   Interpretor MocOS    // 2. MacOS
//                                        Interpretor Linux    // 3. Linux
// -------------------------
// Properties of a Class
// -------------------------
// FileName and the Name of the class has to be the same.
// Creating a class actually creates an object
// Access Modifiers: private, protected, public
    // private:
    // public:
// Java is a Typed language
/** Data Types
 *-------------------------------------------
 * Primitives
 *-------------------------------------------
 * int -> integers (-1,-2, 0, 1, 2, 3 .....)
 * double -> doubles (-1.2, 1.2, 3.0, 3.5 ....) Represented by 64 1's 0's
 * float -> float ((-1.2, 1.2, 3.0, 4.5 .....) Represented by 32 1'0 0's
 * boolean -> true or false
 * char -> a, b, c
 *-------------------------------------------
 * String -> ("Hello World", "DevxSchool")
 * ------------------------------------------
 *
  */


public class HelloWorld {


    public static void main(String[] args) {
        // 10.0 10
        int salaryPerHour = 20;

        //Declaring a variable of Type int
        // 1. Allocating a space in memory 2. Naming it to be salaryPerHour2;



        int salaryPerHour2;

        // Initialize
        salaryPerHour2 = 30;

        System.out.println("SalaryPerHour2 Before: " + salaryPerHour2);
        // + -> Add Things
        // - -> Subtract Things
        // * -> Mulitply Things
        // / -> Divide Things
        salaryPerHour2 = salaryPerHour2 + 20;
        System.out.println("SalaryPerHour2: After" + salaryPerHour2);


        String name = "Memet Topal";

        String name2;

        name2 ="John Doe";

//        System.out.println("SalaryPerHour: " + salaryPerHour);
//        System.out.println("Name: " + name);
//        System.out.println("Name2: " + name2);



        int salary = 40 * 10;
//        System.out.println("My salary is " + salary);
    }


 }



