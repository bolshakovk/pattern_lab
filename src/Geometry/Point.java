package Geometry;

public class Point implements IPoint {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void SetX(double x) {
        this.x = x;
    }


    @Override
    public void SetY(double y) {
        this.y=y;
    }

    @Override
    public double GetX() {
        return x;
    }

    @Override
    public double GetY() {
        return y;
    }
}
