package lecture.week4.interfaceLecture;

import java.util.Scanner;

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