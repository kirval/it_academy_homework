package lecture.week4.interfaceLecture;

public class Telegram implements Messenger {

    public void sendMessage() {
        System.out.println("Отправляем сообщение в Telegram!\n");
    }

     public void getMessage() {
         System.out.println("Читаем сообщение в Telegram!");
     }
}