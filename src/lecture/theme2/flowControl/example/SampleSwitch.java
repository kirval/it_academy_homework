package lecture.theme2.flowControl.example;

public class SampleSwitch {

    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            case 0:
                System.out.println("x is zero.");
                break;
            case 1:
                System.out.println("x is one.");
                break;
            case 2:
                System.out.println("x is two.");
                break;
            case 3:
                System.out.println("x is three.");
                break;
            default:
                System.out.println("x is greater than 3.");
        }
    }

}
