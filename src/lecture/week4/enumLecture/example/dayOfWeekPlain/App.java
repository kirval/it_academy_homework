package lecture.week4.enumLecture.example.dayOfWeekPlain;

public class App {

    public static void main(String[] args) {
        /*
        Проблема: в конструктор класса DayOfWeek можно передать любой текст
         */
        DayOfWeek sunday = new DayOfWeek("Суббота");

        System.out.println(sunday);
    }

}
