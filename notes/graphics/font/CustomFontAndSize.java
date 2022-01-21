import java.awt.*;
import java.applet.*;

/* <applet code = "CustomFontAndSize" height = "300" width = "300"></applet> */

public class CustomFontAndSize extends Applet {
    public void paint(Graphics g) {
        Font myFont = new Font("serif",Font.BOLD+Font.ITALIC,18);
		g.setFont(myFont);  
		g.drawString("Hello GCES",20,50); 
    }
}