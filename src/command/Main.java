package command;

import command.fx.Button;
import command.fx.Command;

public class Main {

    public static void main(String[] args) {

        /*
        Command command =new  AddCustomerCommand(new CustomerService());
        Button button = new Button(command);
        button.click();

         */


        CommandComposite composite = new CommandComposite();

        composite.addCommand(new BlackAndWihiteFilterCommand());
        composite.addCommand(new ResizeImageCommand());

    composite.execute();


    }

}
