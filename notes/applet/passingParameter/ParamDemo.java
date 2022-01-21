import java.applet.*;
import java.awt.*;

// Following HTML chunk will pass parameter to Applet. This is comment for Java Compiler but not for appletviewer, so altering the attribute of parameter never compell to recompile again.

/*/
    <applet code = "ParamDemo" height = "500" width = "500">
        <param name = "fontName" value = "Comic Sans MS">
        <param name = "fontSize" value = "40">
        <param name = "leading" value = "14.80">
        <param name = "active" value = "true">
    </applet>
*/
public class ParamDemo extends Applet {
    String fontName;
    String param;
    int fontSize;
    float leading;
    boolean active;

    public void init() {

        // Param is not used here because to get the String value and again to pass to String, no temp variable (param) is needed.
        fontName = getParameter("fontName");
        if (fontName == null) {
            fontName = "Not Specified";
        }

        // Param is used as temporary String variable which retrieves the parameter passed.

        param = getParameter("fontSize");
        try {
            if (param != null) {
                fontSize = Integer.parseInt(param); // Converts the number in String to Integer data type.
            } else {
                fontSize = 0;
            }
        } catch (NumberFormatException exc) {
            fontSize = 0;
        }

        param = getParameter("leading");
        try {
            if (param != null) {
                leading = Float.valueOf(param).floatValue(); // Converts the number in String to Float data type.
            } else {
                leading = 0f;
            }
        } catch (NumberFormatException exc) {
            leading = 0f;
        }
        param = getParameter("active");
        if (param != null) {
            active = Boolean.valueOf(param).booleanValue(); // Converts the boolean value in String to Boolean data type.
        }
    }

    public void paint(Graphics graphicsObject) {
        graphicsObject.drawString("Font Name : " + fontName, 100, 50);
        graphicsObject.drawString("Font Size : " + fontName, 100, 60);
        graphicsObject.drawString("Leading : " + leading, 100, 70);
        graphicsObject.drawString("Active : " + active, 100, 80);
    }

}