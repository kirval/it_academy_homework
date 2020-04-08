package lecture.week4.enumLecture.example.dayOfWeek;

public class App {

    public static void main(String[] args) {
        DayOfWeek monday1 = DayOfWeek.MONDAY;
        DayOfWeek monday2 = DayOfWeek.MONDAY;

        System.out.println(monday1 == monday2);
        System.out.println(monday1.equals(monday2));

    }

}
