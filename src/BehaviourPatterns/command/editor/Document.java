package BehaviourPatterns.command.editor;

public class Document {

    private String content;

    public void makeBold() {

        content = "<b>" + content + "</b>";

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
