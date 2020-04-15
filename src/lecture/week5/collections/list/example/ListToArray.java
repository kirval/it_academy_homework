package lecture.week5.collections.list.example;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Contents of list: " + list);

        Integer[] array = new Integer[list.size()];
        array = list.toArray(array);

        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        System.out.println("Sum is: " + sum);
    }

}
