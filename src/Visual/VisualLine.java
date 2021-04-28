package Visual;

import Geometry.IPoint;
import Geometry.Line;
import Geometry.Point;

import java.awt.*;

public class VisualLine extends VisualCurve {
    private Line line;

    public VisualLine(IPoint point1, IPoint point2) {
        line = new Line(point1, point2);
    }

    @Override
    public void Draw(Graphics g) {
        IPoint point;
        for(double i=0;i<1; i+=0.0001){
            point = line.GetPoint(i);
            g.drawLine((int) point.GetX(), (int)point.GetY(), (int)point.GetX(), (int)point.GetY());
        }
    }
}
