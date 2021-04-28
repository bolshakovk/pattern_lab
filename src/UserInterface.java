import Geometry.IPoint;
import Geometry.Point;
import Visual.VisualBezier;
import Visual.VisualLine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserInterface extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JButton lineButton;
    private JButton bezierButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    double mouseX;
    double mouseY;

    public UserInterface() {
        setContentPane(contentPane);
        setModal(true);
        System.out.println("x" + mouseX + "y" + mouseY);
        contentPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                mouseX = e.getX();
                mouseY = e.getY();
                System.out.println(mouseX + "   " + mouseY);
            }
        });
        lineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //IPoint testpoint1 = new Point(mouseX, mouseY);
                //IPoint testpoint2 = new Point(mouseX, mouseY);
                //VisualLine visualLine =new VisualLine(testpoint1, testpoint2);
                IPoint point1 = new Point(500,147);
                IPoint point2 = new Point(607,171);
                VisualLine visualLine = new VisualLine(point1,point2);
                Graphics g = getContentPane().getGraphics();
                visualLine.Draw(g);
            }
        });
        bezierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //IPoint testpoint1 = new Point(mouseX, mouseY);
                //IPoint testpoint2 = new Point(mouseX, mouseY);
                //IPoint testpoint3 = new Point(mouseX, mouseY);
                //IPoint testpoint4 = new Point(mouseX, mouseY);
                IPoint point1 = new Point(75,75);
                IPoint point2 = new Point(175,75);
                IPoint point3 = new Point(75,75);
                IPoint point4 = new Point(175,75);
                VisualBezier visualBezier = new VisualBezier(point1,point2,point3,point4);
                Graphics g = getContentPane().getGraphics();
                visualBezier.Draw(g);

            }
        });

    }



    public static void main(String[] args) {
        UserInterface dialog = new UserInterface();
        dialog.pack();
        dialog.setSize(1000,1000);
        dialog.setVisible(true);
        System.exit(0);
    }
}
