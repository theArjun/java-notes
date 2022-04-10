import java.awt.*;
import java.applet.*;

/* <applet code = "DrawOval" height = "300" width = "300"></applet> */

public class DrawOval extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(10, 10, 40, 40);
    }
}