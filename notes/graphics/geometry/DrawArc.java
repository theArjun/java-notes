import java.awt.*;
import java.applet.*;

/* <applet code = "DrawArc" height = "300" width = "300"></applet> */

public class DrawArc extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawArc(10, 10, 100, 100, 10, 170);
        g.fillArc(10, 10, 100, 100, 10, -170);
    }
}