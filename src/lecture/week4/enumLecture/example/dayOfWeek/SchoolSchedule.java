package lecture.week4.enumLecture.example.dayOfWeek;

public class SchoolSchedule {

    private DayOfWeek dayOfWeek;

    public SchoolSchedule(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}