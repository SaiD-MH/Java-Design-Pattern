package BehaviourPatterns.chainOfResponsibility;

public class Compression extends Handler{

    public Compression(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compression Here");
        return false;
    }
}
