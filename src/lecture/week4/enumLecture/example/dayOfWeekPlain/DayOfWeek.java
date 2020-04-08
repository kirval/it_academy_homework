package lecture.week4.enumLecture.example.dayOfWeekPlain;

public class DayOfWeek {

   private String title;

   public DayOfWeek(String title) {
       this.title = title;
   }

   public static void main(String[] args) {
       DayOfWeek dayOfWeek = new DayOfWeek("Суббота");
       System.out.println(dayOfWeek);
   }

   @Override
   public String toString() {
       return "DayOfWeek{" +
               "title='" + title + '\'' +
               '}';
   }
}