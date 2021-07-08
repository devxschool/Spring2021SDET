package simple_problems_solving;

public class CollectionsKnowledgeTask {

    public static void main(String[] args) {

        String str = "55 ^ & nbsp;nbsp;nbsp;SQLException.SQL sajlkafnso klsdmpfw ** ^^%$#^$# ^##^ gsiufouwhfo j SQLJAVAException" +
                "nbsp;nbsp;SQLJAVAException..&&^knslnfrn(SQLException * SQLJAVAException";

        // TASK: is to find the words that contain Exception and print the number of times they appear in the text
        // Expected output: SQLException : 2
        //                  SQLJAVAException : 3

        str = str.replaceAll("[^ a-zA-Z]", " ").trim();
        System.out.println(str);


    }
}
