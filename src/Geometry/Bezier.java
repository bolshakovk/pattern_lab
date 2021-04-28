package Geometry;

public class Bezier extends ACurve {
    IPoint a,b,c,d;

    public Bezier(IPoint a, IPoint b, IPoint c, IPoint d) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }

    @Override
    public IPoint GetPoint(double t) {
        return
                new Point(Math.pow((1-t), 3) * a.GetX() + 3 * t * Math.pow((1-t), 2) * c.GetX() + 3 * Math.pow(t, 2) * (1-t) * d.GetX() + Math.pow(t, 3) * d.GetX(),
                Math.pow((1-t), 3) * a.GetY() + 3 * t * Math.pow((1-t), 2) * c.GetY() + 3 * Math.pow(t, 2) * (1-t) * d.GetY() + Math.pow(t, 3) * d.GetY()); // *c...

    }
}
