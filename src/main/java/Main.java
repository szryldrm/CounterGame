import Model.Initiator;
import Model.Player;
import api.User;

public class Main {

    public static void main(String[] args) {
        User initiator = new Initiator("Initator");
        User player = new Player("Player");

        String messageGetFromPlayer = initiator.sendMessage(player, "Its " + initiator.getUserName() + ", My Message Counter? ");
        String messageGetFromInitiator = player.sendMessage(initiator, "Its " + player.getUserName() + ", My Message Counter? ");
        System.out.println("To Player2, Message Received: " + messageGetFromPlayer);
        messageGetFromPlayer = initiator.sendMessage(player, "Its " + initiator.getUserName()+ ", My Message Counter? ");
        System.out.println("To Player2, Message Received: " + messageGetFromPlayer);
        System.out.println("To Initator, Message Received: " + messageGetFromInitiator);
    }


}
