package CreationalPatterns.AbstractFactory.app;

import CreationalPatterns.AbstractFactory.WidgetFactory;

public class ContactForm {

    public void render(WidgetFactory widgetFactory) {

        widgetFactory.createButton().render();
        widgetFactory.createTextBox().render();

    }

}
