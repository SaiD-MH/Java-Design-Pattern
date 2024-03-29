package BehaviourPatterns.chainOfResponsibility;

public class WebServer {

    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handler(HttpRequest request) {
        handler.handle(request);
    }
}
