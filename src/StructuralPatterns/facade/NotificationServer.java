package StructuralPatterns.facade;

public class NotificationServer {

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("Sending a message : " + message.getContent());
    }

    public Connection connection() {
        return new Connection();
    }

    public AuthToken authToken() {
        return new AuthToken();
    }
}
