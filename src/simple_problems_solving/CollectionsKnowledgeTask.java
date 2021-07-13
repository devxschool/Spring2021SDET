package simple_problems_solving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CollectionsKnowledgeTask {

    public static void main(String[] args) {

        String str = "55 ^ & nbsp;DBSQLException\\nbsp;nbsp;SQLException.SQL sajlk-DBSQLException--afnso  DBSQLException&&*klsdmpfw ** ^^%$#^$# ^##^ gsiufouwhfo j SQLJAVAException;" +
                "nbsp;nbsp;SQLJAVAException..&&^knslnfrn^  ^  [:\" DBSQLException (SQLException * SQLJAVAException";

        // TASK: is to find the words that contain Exception and print the number of times they appear in the text
        // Expected output: SQLException : 2
        //                  DBSQLException : 4
        //                  SQLJAVAException : 3

        str = str.replaceAll("[^ a-zA-Z]", " ").trim().replaceAll(" +", " ");
        String[] arr = str.split(" ");
        System.out.println(str);
        System.out.println(Arrays.toString(arr));

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            if(arr[i].contains("Exception")){
                if(map.containsKey(arr[i])){
                    count = map.get(arr[i]) + 1;
                    map.put(arr[i], count);
                }else map.put(arr[i], count);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
