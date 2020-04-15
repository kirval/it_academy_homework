package lecture.week5.collections.list.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFromArray {

    public static void main(String[] args) {
        String[] array = new String[]{"A", "B", "C"};

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(array));

        System.out.println("Contents of list: " + list);
    }

}
