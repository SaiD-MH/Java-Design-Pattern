package BehaviourPatterns.command;

import BehaviourPatterns.command.fx.Command;

public class ResizeImageCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Filter Resize");
    }
}
