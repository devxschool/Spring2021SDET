package lecture_two;

public class RandomQuestion {

    private static String[] students = {

            "Aisha",
            "Aisulu",
            "Aizada",
            "Anna",
            "Bakai",
            "Casey",
            "Dinara",
            "Edisa",
            "Elina",
            "Irma",
            "Kanybek",
            "Kosta",
            "Lukas",
            "Memet",
            "Milda",
            "Noilya",
            "Ruslana",
            "Tim",
            "Victoria"
    };


    public static void main(String[] args) {
        int min = 0;
        int max = students.length - 1;
        int student = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println("Who will answer the question?");
        int val = 20;
        for(int i = 0; i < val; i++) {
            System.out.print("-");
        }
        System.out.println();
        String studentName = students[student];
        System.out.print("|");
        for(int i = 0; i < (val - studentName.length() - 1) / 2; i++) {
            System.out.print(" ");
        }
        System.out.print(students[student]);
        for(int i = 0; i < (val - studentName.length() - 1) / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        for(int i = 0; i < val; i++) {
            System.out.print("-");
        }
    }
}
