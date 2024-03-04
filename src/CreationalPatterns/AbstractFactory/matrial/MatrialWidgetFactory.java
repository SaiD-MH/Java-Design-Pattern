package CreationalPatterns.AbstractFactory.matrial;

import CreationalPatterns.AbstractFactory.Button;
import CreationalPatterns.AbstractFactory.TextBox;
import CreationalPatterns.AbstractFactory.WidgetFactory;

public class MatrialWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new MatrialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MatrialTextbox();
    }
}
