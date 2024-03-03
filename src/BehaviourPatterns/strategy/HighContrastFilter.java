package BehaviourPatterns.strategy;

public class HighContrastFilter implements  Filter{

    @Override
    public void apply() {
        System.out.println("High Contrast Filter");
    }
}
