package lecture.week4.interfaceLecture.example;

public class Computer implements Workable {

    public boolean turnOn() {
        System.out.println("Компьютер включен.");
        return true;
    }

    public boolean turnOff(){
        System.out.println("Компьютер выключен.");
        return false;
    }

}
