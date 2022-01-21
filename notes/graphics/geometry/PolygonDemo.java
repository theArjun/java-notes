import java.awt.*;
import java.applet.*;

/* <applet code = "PolygonDemo" height = "400" width = "400"></applet> */

public class PolygonDemo extends Applet {
    public void paint(Graphics g) {

        g.setColor(Color.RED);

        int[] xPoints = { 100, 130, 145, 160, 190, 160, 145, 130 };
        int[] yPoints = { 100, 85, 55, 85,100, 115, 145, 115 };

        Polygon p = new Polygon(xPoints, yPoints, 8);
        g.fillPolygon(p);
    }
}