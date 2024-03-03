package BehaviourPatterns.state;

public class Main {
    public static void main(String[] args) {


        Canvas canvas  = new Canvas(new SelectionTool());

        canvas.mouseUp();
        canvas.mouseDown();
    }
}

