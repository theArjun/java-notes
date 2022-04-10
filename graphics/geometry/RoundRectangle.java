import java.awt.*;
import java.applet.*;

/* <applet code = "RoundRectangle" height = "300" width = "300"></applet> */

public class RoundRectangle extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRoundRect(10, 10, 40, 40 ,5, 5);
    }
}   