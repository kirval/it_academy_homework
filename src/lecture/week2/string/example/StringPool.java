package lecture.week2.string.example;

public class StringPool {

    public static void main(String[] args) {
        String first = "Pool";
        String second = "Pool";
        String third = new String("Pool");

        System.out.println(first == second);
        System.out.println(first == third);
    }

}
