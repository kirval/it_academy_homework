package lecture.theme2.operator.example;

public class BoolLogic {

    public static void main(String[] args) {
        int x = 10;

        boolean and = 1 < x && x < 5;
        boolean or = 1 < x || x < 5;

        System.out.println("1 < x и x < 5: " + and);
        System.out.println("1 < x или x < 5: " + or);
    }

}
