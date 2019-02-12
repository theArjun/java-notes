import java.awt.*;
import java.applet.Applet;

/* <applet code = "ColorDemo" height = "300" width = "300"></applet> */

public class ColorDemo extends Applet {
    public void paint(Graphics g) {
        g.setColor(new Color(255, 0, 0));
        g.fillRect(60, 60, 40, 40);
        g.drawString("Hello World", 40, 40);
        g.setColor(new Color(0, 255, 0));
        g.fillRect(90, 60, 40, 40);
        g.drawString("GCES", 40, 80);

    }
}