package CreationalPatterns.factoryMethod.thyemleafViewEngin;

import CreationalPatterns.factoryMethod.matcha.ViewEngin;

public class thyemleaf implements ViewEngin {
    @Override
    public void render() {
        System.out.println("Thymleaf view Engin .. ");
    }
}
