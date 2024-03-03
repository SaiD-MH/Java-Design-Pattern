package BehaviourPatterns.template;

public abstract class Task {

    private Audit audit;

    public Task() {
        audit = new Audit();
    }

    public void execute() {

        audit.record();

        doExecute();

    }

    protected abstract void doExecute();


}
