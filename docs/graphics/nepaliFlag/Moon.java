import java.awt.*;
import java.applet.*;

/* <applet code = "Moon" height = 500 width  ="500"></applet> */

public class Moon extends Applet {

    public static final int ABSCISSA = 100, ORDINATE = 200;

    public void paint(Graphics moon) {

        int[] borderX = {0,};

        setBackground(Color.RED);
        Color NEPALIFLAG = new Color(221, 12, 39);
        moon.setColor(Color.WHITE);
        moon.fillArc(ABSCISSA, ORDINATE, 200, 200, 0, -180);
        moon.setColor(Color.RED);
        moon.fillArc(ABSCISSA, ORDINATE, 200, 170, 0, -180);

    }

}