package simple_problems_solving;

public class WeekdayOrWeekendSwitchCase {

    public static void main(String[] args) {

        String day = "Tuesday";

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday", "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("It's not a day");
        }
    }
}
