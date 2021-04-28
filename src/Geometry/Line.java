package Geometry;

public class Line extends ACurve{
    IPoint a, b;
    public Line(IPoint a, IPoint b){
        this.a = a;
        this.b = b;
    }
    @Override
    public IPoint GetPoint(double t) {
        return new Point(((1-t) * a.GetX() + t * b.GetY()),
                (1-t) * a.GetX() + t * b.GetY());
    }
}
