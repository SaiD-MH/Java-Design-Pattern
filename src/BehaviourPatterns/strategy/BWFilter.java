package BehaviourPatterns.strategy;

public class BWFilter implements Filter{

    @Override
    public void apply() {
        System.out.println("Jpeg Filter");
    }
}
