package CreationalPatterns.factoryMethod.matcha;

public class Controller {

    public void render() {

        var engin = createViewEngin();
        engin.render();

    }

    protected ViewEngin createViewEngin() {
        return new MatchViewEngin();
    }

}
