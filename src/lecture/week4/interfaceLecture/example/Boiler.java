package lecture.week4.interfaceLecture.example;

public class Boiler implements Workable {

    public boolean turnOn() {
        System.out.println("Бойлер включен.");
        return true;
    }

    public boolean turnOff() {
        System.out.println("Бойлер выключен.");
        return false;
    }
}
