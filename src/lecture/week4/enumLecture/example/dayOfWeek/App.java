package lecture.week4.enumLecture.example.dayOfWeek;

public class App {

    public static void main(String[] args) {

        SchoolSchedule schedule = new SchoolSchedule(DayOfWeek.MONDAY);
        Scholar ivan = new Scholar();

        ivan.wakeUp(schedule);
    }

}
