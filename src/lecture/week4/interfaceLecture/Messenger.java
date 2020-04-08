package lecture.week4.interfaceLecture;

public interface Messenger{

     void sendMessage();

     void getMessage();

     default void printInvitationMessage() {
          System.out.println("Введите сообщение: ");
     }

}