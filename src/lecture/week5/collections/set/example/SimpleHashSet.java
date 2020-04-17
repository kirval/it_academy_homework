package lecture.week5.collections.set.example;

import java.util.HashSet;
import java.util.Set;

public class SimpleHashSet {

    public static void main(String args[]) {
        Set<String> set = new HashSet<String>();

        // Add elements to the hash set.
        set.add("Beta");
        set.add("Alpha");
        set.add("Eta");
        set.add("Gamma");
        set.add("Epsilon");
        set.add("Omega");
        set.add("Omega");

        System.out.println(set);
    }

}
