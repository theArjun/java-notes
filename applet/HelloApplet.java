import java.awt.*;
import java.applet.*;

public class HelloApplet extends Applet{
    public void paint(Graphics graphicsObject){
        graphicsObject.drawString("Hello Applet ! How are you ?", 10 , 20); // 10 are 20 are X-coordinates and Y-coordinates.
    }
}