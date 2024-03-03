package BehaviourPatterns.command;

import BehaviourPatterns.command.fx.Command;

public class BlackAndWihiteFilterCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Black & White");
    }
}
