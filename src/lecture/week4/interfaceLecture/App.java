package lecture.week4.interfaceLecture;

public class App {

    public static void main(String[] args) {
        Messenger telegram = new Telegram();
        Messenger viber = new Viber();
        Messenger whatsApp = new WhatsApp();

        Client alex = new Client((WhatsApp) whatsApp, null, null);
        Client ivan = new Client(null, (Telegram) telegram, null);
        Client vasiliy =  new Client(null, null, (Viber) viber);

        alex.sendWhatsAppMessage();
        ivan.sendTelegramMessage();
        vasiliy.sendViberMessage();
    }

}
