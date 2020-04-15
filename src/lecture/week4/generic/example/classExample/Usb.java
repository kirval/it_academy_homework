package lecture.week4.generic.example.classExample;

import java.util.Scanner;

public class Usb implements Drive {

    private String data;

    @Override
    public void write() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите данные: ");

        data=scan.nextLine();


    }

    @Override
    public void read() {
        System.out.println(data);

    }
}
