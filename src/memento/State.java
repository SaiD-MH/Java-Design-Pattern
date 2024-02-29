package memento;

public class State {

    private final String content;

    public State(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
