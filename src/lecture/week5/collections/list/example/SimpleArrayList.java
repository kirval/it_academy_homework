package lecture.week5.collections.list.example;

import java.util.ArrayList;
import java.util.List;

public class SimpleArrayList {

    public static void main(String args[]) {

        List<String> list = new ArrayList<>();

        System.out.println("Initial size of list: " +
                list.size());

        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");
        list.add(1, "A2");

        System.out.println("Size of list after additions: " +
                list.size());

        System.out.println("Contents of list: " + list);

        list.remove("F");
        list.remove(2);

        System.out.println("Size of list after deletions: " +
                list.size());
        System.out.println("Contents of list: " + list);
    }

}
