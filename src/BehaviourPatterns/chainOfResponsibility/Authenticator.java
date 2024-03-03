package BehaviourPatterns.chainOfResponsibility;

public class Authenticator extends Handler {


    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {


        boolean check = request.getUsername() == "admin" && request.getPassword() == "1234";
        System.out.println("Authenticator Here " + check);
        return !check;
    }
}
