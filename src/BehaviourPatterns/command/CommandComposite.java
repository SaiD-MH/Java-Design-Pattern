package BehaviourPatterns.command;

import BehaviourPatterns.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandComposite implements Command {

    List<Command> commands = new ArrayList<>();

    void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
