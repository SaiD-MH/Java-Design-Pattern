package BehaviourPatterns.state;

public class Canvas {

    private Tool tool;

    public Canvas(Tool tool) {
        this.tool = tool;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    void mouseUp(){
        tool.mouseUp();
    }
    void mouseDown(){
        tool.mouseDown();
    }
}
