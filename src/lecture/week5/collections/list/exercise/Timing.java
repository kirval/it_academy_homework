package lecture.week5.collections.list.exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing {

    public static void main(String[] args) {
        Timing timing = new Timing();
        timing.arrayListAddTiming();
        timing.linkedListAddTiming();

    }

    void arrayListAddTiming() {
        List<Integer> list = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, 1);
        }
        long time = System.currentTimeMillis() - startTime;

        System.out.println("Время ArrayList: " + time);
    }

    void linkedListAddTiming() {
        List<Integer> list = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, 1);
        }
        long time = System.currentTimeMillis() - startTime;

        System.out.println("Время LinkedList: " + time);
    }
}
