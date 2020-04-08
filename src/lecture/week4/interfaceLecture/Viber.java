package lecture.week4.interfaceLecture;

public class Viber implements Messenger {

    public void sendMessage() {
        System.out.println("Отправляем сообщение в Viber!\n");
    }

     public void getMessage() {
         System.out.println("Читаем сообщение в Viber!");
     }
}