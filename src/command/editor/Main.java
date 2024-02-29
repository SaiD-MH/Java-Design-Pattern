package command.editor;

public class Main {

    public static void main(String[] args) {

        Document document = new Document();
        document.setContent("Hello , World");

        History history = new History();

        BoldCommand command = new BoldCommand(document, history);

        command.execute();

        System.out.println(document.getContent());

        UndoCommand undoCommand = new UndoCommand(history);

        undoCommand.execute();
        System.out.println(document.getContent());

    }

}
