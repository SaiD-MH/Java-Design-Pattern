package BehaviourPatterns.state;

public class BrushTool implements Tool{

    @Override
    public void mouseUp() {
        System.out.println("Brush Are Now Used");
    }

    @Override
    public void mouseDown() {

        System.out.println("Draw Colored Circle");
    }
}
