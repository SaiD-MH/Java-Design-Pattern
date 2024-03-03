package StructuralPatterns.facade;

public class NotificationService {


    public void send(String msg, String tar) {

        NotificationServer server = new NotificationServer();
        var connect = server.connection();
        var auth = server.authToken();

        server.send(auth, new Message(msg), tar);
    }

}
