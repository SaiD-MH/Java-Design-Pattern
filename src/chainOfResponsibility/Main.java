package chainOfResponsibility;

public class Main {

    public static void main(String[] args) {

        Compression compression = new Compression(null);
        Logger logger = new Logger(compression);
        Authenticator authenticator = new Authenticator(logger);

        WebServer webServer = new WebServer(authenticator);
        webServer.handler(new HttpRequest("admin","1234"));

    }

}
