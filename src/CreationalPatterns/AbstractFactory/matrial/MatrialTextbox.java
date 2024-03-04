package CreationalPatterns.AbstractFactory.matrial;

import CreationalPatterns.AbstractFactory.TextBox;

public class MatrialTextbox implements TextBox {
    @Override
    public void render() {
        System.out.println("Render - Matrial - TextBox");
    }
}
