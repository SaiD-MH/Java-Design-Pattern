package StructuralPatterns.flyWeight;

public class Point {

    private int x;
    private int y;

    PointIcon icon;

    public Point(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public void draw() {
        System.out.printf("point with type : %s at (%d , %d)",
                icon.getType(), x, y);
    }
}
