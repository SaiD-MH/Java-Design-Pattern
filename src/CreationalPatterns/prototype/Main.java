package CreationalPatterns.prototype;

public class Main {


    public static void main(String[] args) {


        Circle circle = new Circle();
        circle.setRadius(5);

        ContentMenu menu = new ContentMenu();
        Circle newC = (Circle) menu.duplicate(circle);

        System.out.println(newC.getRadius());

    }

}
