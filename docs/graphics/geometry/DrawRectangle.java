import java.awt.*;
import java.applet.*;

/* <applet code = "DrawRectangle" height = "300" width = "300"></applet> */

public class DrawRectangle extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(10, 10, 40, 40);
    }
}