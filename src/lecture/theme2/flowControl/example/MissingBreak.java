package lecture.theme2.flowControl.example;

public class MissingBreak {

    public static void main(String[] args) {
        int x = 2;

        switch (x) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("x is less than 5");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("x is less than 10");
                break;
            default:
                System.out.println("x is 10 or more.");
        }
    }

}
