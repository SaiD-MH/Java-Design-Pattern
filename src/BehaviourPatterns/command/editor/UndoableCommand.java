package BehaviourPatterns.command.editor;

public interface UndoableCommand extends Command{

    void unExecute();

}
