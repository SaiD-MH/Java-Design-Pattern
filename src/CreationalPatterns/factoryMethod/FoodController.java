package CreationalPatterns.factoryMethod;

import CreationalPatterns.factoryMethod.matcha.Controller;
import CreationalPatterns.factoryMethod.matcha.ViewEngin;
import CreationalPatterns.factoryMethod.thyemleafViewEngin.thyemleaf;

public class FoodController extends Controller {


    public void listFoods(){
        render();
    }

    @Override
    protected ViewEngin createViewEngin() {
        return new thyemleaf();
    }
}
