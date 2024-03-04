package CreationalPatterns.AbstractFactory.ant;

import CreationalPatterns.AbstractFactory.TextBox;

public class AntTextbox implements TextBox {
    @Override
    public void render() {
        System.out.println("Render - Ant - TextBox");
    }
}
