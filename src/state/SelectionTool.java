package state;

public class SelectionTool implements Tool {

    @Override
    public void mouseUp() {
        System.out.println("Selection tool are used");
    }

    @Override
    public void mouseDown() {

        System.out.println("draw dashed rectangle");
    }
}
