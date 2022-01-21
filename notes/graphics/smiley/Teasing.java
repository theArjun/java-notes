
/* Creation : Arjun Adhikari */

import java.awt.*;
import java.applet.*;

/* <applet code = "Teasing" height = "800" width = "700"></applet>*/

public class Teasing extends Applet {
    public static final Color FACE = new Color(255, 205, 0);
    public static final Color TONGUE = new Color(209, 48, 51);

    public void paint(Graphics smiley) {
        setBackground(Color.WHITE);

        /* Face */
        smiley.setColor(FACE);
        smiley.fillOval(100, 100, 500, 500);

        /* Eye Sclera */
        smiley.setColor(Color.WHITE);
        smiley.fillOval(380, 230, 100, 100);

        /* Eye Pupil */
        smiley.setColor(Color.BLACK);
        smiley.fillOval(405, 255, 50, 50);

        /* Winking Eye */
        smiley.fillArc(220, 270, 90, 60, 0, 180);

        /* Mouth */
        smiley.fillArc(220, 290, 260, 220, 0, -180);
        smiley.setColor(FACE);
        smiley.fillArc(220, 300, 260, 150, 0, -180);

        /* Tongue */
        smiley.setColor(TONGUE);
        smiley.fillRoundRect(310, 480, 90, 80, 30, 30);
        smiley.fillArc(310, 500, 90, 90, 0, -180);
    }
}