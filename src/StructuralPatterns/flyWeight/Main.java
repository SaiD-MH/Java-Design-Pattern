package StructuralPatterns.flyWeight;

public class Main {


    public static void main(String[] args) {

        var service = new PointService(new PointIconFactory());

        service.getPoints().stream().forEach((p) -> p.draw());


    }

}
