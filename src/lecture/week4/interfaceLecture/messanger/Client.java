package lecture.week4.interfaceLecture.messanger;

public class Client {

    private Messenger messenger;

    public Client(Messenger messenger) {
        this.messenger = messenger;
    }

    public void sendMessage() {
        messenger.printInvitationMessage();
        messenger.sendMessage();
    }

}