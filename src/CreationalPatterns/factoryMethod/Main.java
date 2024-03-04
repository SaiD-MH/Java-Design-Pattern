package CreationalPatterns.factoryMethod;

public class Main {

    public static void main(String[] args) {


        new ProductController().getProductsList();
        new FoodController().listFoods();
    }
}
