import java.awt.*;
import java.applet.Applet;

/* <applet code = "FontMetricsDemo" height = "300" width = "300"></applet> */

public class FontMetricsDemo extends Applet {
    public void paint(Graphics g) {
        Font myFont = new Font("serif", Font.BOLD + Font.ITALIC, 18); // Italic ra Bold duitai banauana ko lagi
        g.setFont(myFont);
        g.drawString("Hello GCES", 20, 50);

        FontMetrics fm;
        fm = getFontMetrics(myFont); // Yo chahi graphics context ko properties

        g.drawString("Ascent Value : " + fm.getAscent(), 20, 80);
        g.drawString("Descent Value : " + fm.getDescent(), 20, 100);
        g.drawString("Leading Value : " + fm.getLeading(), 20, 120);
        g.drawString("Height Value : " + fm.getHeight(), 20, 140);
    }
}
