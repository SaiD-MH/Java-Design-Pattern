package CreationalPatterns.AbstractFactory.ant;

import CreationalPatterns.AbstractFactory.Button;
import CreationalPatterns.AbstractFactory.TextBox;
import CreationalPatterns.AbstractFactory.WidgetFactory;

public class AntFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextbox();
    }
}
