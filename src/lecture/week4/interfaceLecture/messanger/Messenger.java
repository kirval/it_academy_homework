package lecture.week4.interfaceLecture.messanger;

public interface Messenger {

    static int x = 5;

    static void  test(){
        System.out.println("test");
    }

    void sendMessage();

    void getMessage();

    default void printInvitationMessage() {
        System.out.println("Введите сообщение: ");
    }

}