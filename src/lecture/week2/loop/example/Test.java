package lecture.week2.loop.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer x = Integer.parseInt(reader.readLine());

        System.out.println(x);
    }
}
