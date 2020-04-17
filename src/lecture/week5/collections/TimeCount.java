package lecture.week5.collections;

//Пример замера времени выполнения операций
public class TimeCount {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }

        long time = System.currentTimeMillis() - startTime;

        System.out.println(sum);
        System.out.println("Затраченное время: " + time + "мсек");
    }

}
