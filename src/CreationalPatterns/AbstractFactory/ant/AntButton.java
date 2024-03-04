package CreationalPatterns.AbstractFactory.ant;

import CreationalPatterns.AbstractFactory.Button;

public class AntButton implements Button {


    @Override
    public void render() {
        System.out.println("Render - Ant - Button");
    }
}
