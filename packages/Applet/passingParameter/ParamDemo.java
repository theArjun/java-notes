import java.applet.Applet;
import java.awt.Graphics;

// Following HTML chunk will pass parameter to Applet. This is comment for Java Compiler but not for appletviewer, so altering the attribute of parameter never compell to recompile again.

/*/
    <applet code = "ParamDemo.class" height = "300" width = "300">
        <param name = "fontName" value = "Comic Sans MS">
        <param name = "fontSize" value = "40">
        <param name = "leadingfontName" value = "14.80">
        <param name = "active" value = "true">
    </applet>
*/
public class ParamDemo extends Applet {
    String fontName;
    String param;
    int fontSize;
    double leading;
    boolean active;

    public void init() {

        // Param is not used here because to get the String value and again to pass to String, no temp variable is needed.
        fontName = this.getParameter("fontName");
        if (fontName == null) {
            fontName = "Times New Roman";
        }

        //Param is used as temporary String variable which retrieves the parameter passed. 

        param = this.getParameter("fontSize");
        fontSize = Integer.parseInt(param); // Converts the number in String to Integer data type.
        if (param == null) {
            fontSize = 20;
        }

        param = this.getParameter("leading");
        leading = Float.valueOf(param).floatValue(); // Converts the number in String to Float data type.
        if (param == null) {
            leading = 20.01;
        }

        param = this.getParameter("active");
        active = Boolean.valueOf("active").booleanValue(); // Converts the boolean value in String to Boolean data type.
        if (param == null) {
            active = false;
        }
    }

    public void paint(Graphics graphicsObject) {
        graphicsObject.drawString("Font Name : " + fontName, 100, 50);
        graphicsObject.drawString("Font Size : " + fontName, 100, 60);
        graphicsObject.drawString("Leading : " + leading, 100, 70);
        graphicsObject.drawString("Active : " + active, 100, 80);
    }

}