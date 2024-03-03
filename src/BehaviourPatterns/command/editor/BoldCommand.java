package BehaviourPatterns.command.editor;

public class BoldCommand implements UndoableCommand{

    private String prevContent;
    private Document document;
    private History history;


    public BoldCommand(Document document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void unExecute() {

        document.setContent(prevContent);

    }

    @Override
    public void execute() {

        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }
}
