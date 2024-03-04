package CreationalPatterns.factoryMethod;

import CreationalPatterns.factoryMethod.matcha.Controller;
import CreationalPatterns.factoryMethod.matcha.MatchViewEngin;
import CreationalPatterns.factoryMethod.matcha.ViewEngin;

public class ProductController extends Controller {


    public void getProductsList(){

        render();

    }

    @Override
    protected ViewEngin createViewEngin() {
        return new MatchViewEngin();
    }
}
