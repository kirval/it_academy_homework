package lecture.week4.interfaceLecture.example;

public class Screen implements Workable {

    public boolean turnOn() {
        System.out.println("Экран включен.");
        return true;
    }

    public boolean turnOff(){
        System.out.println("Экран выключен.");
        return false;
    }

}
