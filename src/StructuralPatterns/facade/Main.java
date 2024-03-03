package StructuralPatterns.facade;

public class Main {


    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        service.send("Hello " , "ip:132.011.001");
    }

}
