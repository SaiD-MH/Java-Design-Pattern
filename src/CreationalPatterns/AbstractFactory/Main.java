package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.ant.AntFactory;
import CreationalPatterns.AbstractFactory.app.ContactForm;
import CreationalPatterns.AbstractFactory.matrial.MatrialWidgetFactory;

public class Main {

    public static void main(String[] args) {

        new ContactForm().render(new MatrialWidgetFactory());
    }
}
