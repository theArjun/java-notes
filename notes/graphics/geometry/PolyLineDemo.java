import java.awt.*;
import java.applet.*;

/* <applet code = "PolyLineDemo" height = "500" width = "500"></applet> */

public class PolyLineDemo extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.RED);

        int[] xCo = {10,20,30};
        int[] yCo = {100,150,120};

        g.drawPolyLine(xCo, yCo, 3);
    }
}