package lecture.week4.interfaceLecture;

import java.util.Scanner;

public class Client {

    private WhatsApp whatsApp;
    private Telegram telegram;
    private Viber viber;

    public Client(WhatsApp whatsApp, Telegram telegram, Viber viber) {
        this.whatsApp = whatsApp;
        this.telegram = telegram;
        this.viber = viber;
    }

    public void sendWhatsAppMessage(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сообщение: ");
        String message = scanner.nextLine();
        whatsApp.sendMessage();
    }

    public void sendViberMessage(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сообщение: ");
        String message = scanner.nextLine();
        viber.sendMessage();
    }

    public void sendTelegramMessage(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сообщение: ");
        String message = scanner.nextLine();
        telegram.sendMessage();
    }

    //    private Messenger messenger;

}