package memento;

public class Editor {

    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public State createState() { // save state
        return new State(content);
    }

    public void restoreState(State state) { // will undo to previous state
        content = state.getContent();
    }


}
