package lecture.week4.interfaceLecture.messanger;

public class WhatsApp implements Messenger {

    public void sendMessage() {
        System.out.println("Отправляем сообщение в WhatsApp!\n");
    }

     public void getMessage() {
         System.out.println("Читаем сообщение в WhatsApp!");
     }
}