package lecture.week4.interfaceLecture.messanger;

public class App {

    public static void main(String[] args) {
        Messenger telegram = new Telegram();
        Messenger viber = new Viber();
        Messenger whatsApp = new WhatsApp();

        Client alex = new Client(whatsApp);
        Client ivan = new Client(telegram);
        Client vasiliy = new Client(viber);

        alex.sendMessage();
        ivan.sendMessage();
        vasiliy.sendMessage();

        Messenger.test();
    }

}
