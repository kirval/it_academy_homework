package lecture.week5.collections.set.exercise;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("Груша");

        for(String str:set){
            System.out.println(str);
        }
    }
}
