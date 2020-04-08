package lecture.week4.exercise;

public class App {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.UsbPort usbPort = computer.new UsbPort();
        UsbDrive usb = new UsbDrive();

        usbPort.putInUsbDrive();
        if (computer.isUsbExists()) {
            computer.writeDataToUsbDrive(usb);
            computer.printDataFromUsbDrive(usb);
        }
    }

}
