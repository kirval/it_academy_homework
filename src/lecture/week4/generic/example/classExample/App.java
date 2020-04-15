package lecture.week4.generic.example.classExample;

public class App {

    public static void main(String[] args) {
        Usb usb1 = new Usb();
        HDD hdd1 = new HDD();
        Computer comp = new Computer();
        comp.write(usb1);
        comp.read(usb1);
        comp.write(hdd1);
        comp.read(hdd1);
    }
}
