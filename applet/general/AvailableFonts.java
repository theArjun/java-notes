/* This shows the available fonts in Host Computer. */

/* <applet code = "AvailableFonts" height ="300" width = "300" ></applet> */

import java.awt.*;
import java.applet.*;

public class AvailableFonts extends Applet {
    public void paint(Graphics g) {
        String message = ""; // Initialize string to empty first.
        String fontLists[];
        /* I don't get the below line. */
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        fontLists = ge.getAvailableFontFamilyNames();
        for (String fontList : fontLists) {
            message += fontList + "\n ";
            g.drawString(message, 10, 20);
        }
    }
}
