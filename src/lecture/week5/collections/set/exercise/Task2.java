package lecture.week5.collections.set.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число: ");
//            int num = scanner.nextInt();
//            if(num <= 10){
//                numbers.add(num);
//            }
            numbers.add(scanner.nextInt());
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() <= 10) {
                iterator.remove();
            }
        }

        //Пример использования стримов
//        numbers = numbers.stream()
//                .filter(num -> !(num > 10))
//                .collect(Collectors.toSet());

        System.out.println(numbers);
    }

}
