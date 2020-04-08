package lecture.week4.exercise;

import java.util.Scanner;

public class Computer {

    private boolean isUsbExists;

    public boolean isUsbExists() {
        return isUsbExists;
    }

    public void writeDataToUsbDrive(UsbDrive usb) {
        if (usb != null) {
            usb.setType(DataType.valueOf(
                    getDataFromKeyboar("Введите тип данных: ").toUpperCase()));
            usb.setData(getDataFromKeyboar("Введите данные: "));
        }
    }

    public void printDataFromUsbDrive(UsbDrive usb) {
        if (usb != null) {
            switch (usb.getType()) {
                case FILE: {
                    System.out.println("Файл: " + usb.getData());
                    break;
                }
                case AUDIO: {
                    System.out.println("Играет песня " + usb.getData());
                    break;
                }
                case MOVIE: {
                    System.out.println("Воспроизводится фильм  " + usb.getData());
                    break;
                }
            }
        }
    }

    public String getDataFromKeyboar(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public class UsbPort {

        public void putInUsbDrive() {
            Computer.this.isUsbExists = true;
        }

        public void putOutUsbDrive() {
            Computer.this.isUsbExists = false;
        }
    }

}
