package lecture.week4.enumLecture.example.dayOfWeek;

public class Scholar{

    public void wakeUp(SchoolSchedule schedule) {
        DayOfWeek today = schedule.getDayOfWeek();

        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY: {
                System.out.println("Блин, опять в школу :(");
                break;
            }
            case SUNDAY:
            case SATURDAY: {
                System.out.println("Ура, можно поспать еще!");
                break;
            }
        }
    }
}