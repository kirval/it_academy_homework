package lecture.week4.interfaceLecture.example;

public class AirConditioning implements Workable {

    public boolean turnOn() {
        System.out.println("Кондиционер включен.");
        return true;
    }

    public boolean turnOff(){
        System.out.println("Кондиционер выключен.");
        return false;
    }

}
