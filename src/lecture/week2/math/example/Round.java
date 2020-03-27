package lecture.week2.math.example;

import java.util.Scanner;

public class Round {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        int radius = in.nextInt();
        long area = Math.round(Math.PI * Math.pow(radius, 2));
        System.out.printf("Площадь круга с радиусом %d равна %d \n", radius, area);
    }

}
