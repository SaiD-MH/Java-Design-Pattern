package CreationalPatterns.AbstractFactory.matrial;

import CreationalPatterns.AbstractFactory.Button;

public class MatrialButton implements Button {

    @Override
    public void render() {
        System.out.println("Render - Material - Button");
    }
}
