package simple_problems_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversingArraylist {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Edisa");
        list.add("Bakai");
        list.add("Aizada");
        list.add("Memet");
        list.add("Viktoria");
        list.add("Aisulu");

        System.out.println(list);

        List<String> reversedList = new ArrayList<>();

        int lastElementIndexOfList = list.size()-1;
        for (int i = lastElementIndexOfList; i >= 0; i--){
            String name = list.get(i);
            reversedList.add(name);
        }
        System.out.println(reversedList);
    }
}
