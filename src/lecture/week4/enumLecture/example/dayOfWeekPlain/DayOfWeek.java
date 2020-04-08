package lecture.week4.enumLecture.example.dayOfWeekPlain;

public class DayOfWeek {

   private String title;

   public DayOfWeek(String title) {
       this.title = title;
   }

   @Override
   public String toString() {
       return "DayOfWeek{" +
               "title='" + title + '\'' +
               '}';
   }
}