package switch_statements;

public class switchDaysOfWeek {

    public static void main(String[] args) {

        int day = 3;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Yay! Weekend");
                break;

            default:
                System.out.println("Please try again!");
                break;
        }

        if(day >= 1 && day <= 5){
            System.out.println("Weekday");
        }else if (day == 6 || day == 7){
            System.out.println("Weekend");
        }else {
            System.out.println("Invalid day!");
        }
    }
}
