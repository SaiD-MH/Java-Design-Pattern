package BehaviourPatterns.command;

import BehaviourPatterns.command.fx.Button;
import BehaviourPatterns.command.fx.Command;

public class Main {

    public static void main(String[] args) {

        /*
        Command BehaviourPatterns.command =new  AddCustomerCommand(new CustomerService());
        Button button = new Button(BehaviourPatterns.command);
        button.click();

         */


        CommandComposite composite = new CommandComposite();

        composite.addCommand(new BlackAndWihiteFilterCommand());
        composite.addCommand(new ResizeImageCommand());

    composite.execute();


    }

}
