package Visual;

import Geometry.Bezier;
import Geometry.IPoint;

import java.awt.*;

public class VisualBezier extends VisualCurve {
    private Bezier bezier;

    public VisualBezier(IPoint point1, IPoint point2, IPoint point3, IPoint point4) {
        bezier = new Bezier(point1,point2,point3,point4);
    }

    @Override
    public void Draw(Graphics g) {
        IPoint point;
        for(double i=0;i<1; i+=0.01){
            point = bezier.GetPoint(i);

            g.drawLine((int)point.GetX(), (int)point.GetY(), (int)point.GetX(), (int)point.GetY());
        }
    }
}
