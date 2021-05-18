package data_type_casting_and_operator_precedence;

public class DataTypeCasting {

    // data type casting is when we are converting
    // one data type to another data type

    //wide data type casting - upcasting

    //narrow data type casting - down casting



    public static void main(String[] args) {


        // 2 < 2.01

//        double x = 222.345;
//
//        int y = (int) x;
//
//        double z = (double) y;
//
//        System.out.println("Double:"+x);
//        System.out.println("Int:"+y);
//        System.out.println("Double:"+z);



        int a = 1;

        System.out.println("Pre increment: "+ ++a); // pre increment(increase) ++a = a+1
        System.out.println("Post increment in the same line: " + a++);
        System.out.println(" Post increment on the next line: " + a);

        int b = 6;
        int c = 8;

        System.out.println("Pre decrement: "+ --b); // pre decrement --b = b-1
        System.out.print("Post decrement in the same line: " + --c +" " + b-- + "\n");
        System.out.println(" Post decrement on the next line: " + b);

        boolean isDigit =
                !true;

        int f = 5/2;
        int g = 5%2; // 2 * 2 = 4 --> 5-4 = 1;

        System.out.println(f);
        System.out.println(g);

        //4%2 = 0; //even number -> divisible by 2 remainder is 0 [2,4,6,8,1222,10334 etc]

        //7%2 = 1; //odd numbers -> always have a remainder when divided by an even number(2) -> [1,3,5,7,9,13 etc]

        long j = 1733484593452L;

        if(j % 2 != 0){
            System.out.println("It's odd");
        }else {
            System.out.println("It's even");
        }

        int q = 1;
        int r = 2;
        r += q; // r = r + q;

        int output = 0;

        if( !(q < r && r != 0) ){ // '&&' logical and -> true when both operations are true
            output--;
        }else {
            output++;
        }

        System.out.println("The outcome is: " + output);


        int h = 1 + 2 + 4 + 6 / 2;

        System.out.println(h);

        // >= -> greater than or equal to;
        // <= -> less than or equal to;

        int k = 1;
        int l = 1;

        if(k >= l){
            System.out.println("K is bigger than l");
        }else {
            System.out.println("L is bigger than k");
        }
    }
}
