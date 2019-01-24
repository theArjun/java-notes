import java.applet.*;
import java.awt.*;

/*
    <applet code = "LifeCycle.class" height = "300" width = "300">

    </applet>
*/

public class LifeCycle extends Applet{
    String message = "";

    public void init(Graphics graphicsObject){
        message += "Inside Init()     ";
        graphicsObject.drawString(message, 100, 120);
    }

    public void start() {
        message += "Inside Start()     ";
    }

    public void paint(Graphics graphicsObject) {
        message += "Inside Paint()     ";
        graphicsObject.drawString(message, 100, 120);
    }

    public void stop() {
        message += "Inside Stop()     ";
    }
    
    public void destroy() {
        message += "Inside Destroy()     ";
    }
}