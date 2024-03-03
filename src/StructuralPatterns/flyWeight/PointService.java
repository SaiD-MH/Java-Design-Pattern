package StructuralPatterns.flyWeight;

import java.util.ArrayList;
import java.util.List;

public class PointService {


    private PointIconFactory factory;

    public PointService(PointIconFactory factory) {
        this.factory = factory;
    }

    public List<Point> getPoints() {

        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 1, new PointIcon(PointType.COFF, null)));

        return points;
    }


}
