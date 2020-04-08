package lecture.week4.enumLecture.example.dayOfWeek;

public enum DayOfWeek {

    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    public String title;

    DayOfWeek(String title) {
        this.title = title;
    }

    void printTitle() {
        System.out.println(title);
    }

}