package api;

import Util.Utility;

import java.util.HashMap;
import java.util.Map;

public abstract class User {

    String userName;
    public Map<User, Integer> receivedMessages = new HashMap<>();

    public User(String userName) {
        this.userName = userName;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String sendMessage(User toPlayer, String message){

        Utility.write(getUserName() + " sent a message '" +message + "' to " +toPlayer.getUserName());

        return toPlayer.receiveMessage(this, message);
    }

    /**
     * Our receive method.
     * We are getting message from another player.
     * We can get maximum 10 messages from player. If it is more then 10, app will be close.
     * @param fromPlayer the reference of the other player
     * @param message   the message received from the other player
     * @return  returns message + counter (messages received from otherPlayer)
     */
    public String receiveMessage(User fromPlayer, String message) {
        Integer counter = receivedMessages.getOrDefault(fromPlayer, 0) + 1;
        receivedMessages.put(fromPlayer, counter);
        Utility.write(getUserName() + " get a (counter: " + counter + ") message '" + message + "' from " +fromPlayer.getUserName());
        if (counter == 10) {
            System.exit(0);
        }
        return message + counter;
    }

}