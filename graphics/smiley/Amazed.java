/* Creation : Arjun Adhikari */

import java.awt.*;
import java.applet.*;

/* <applet code = "Amazed" height = "700" width = "700"></applet>*/

public class Amazed extends Applet {
    public static final Color FACE = new Color(255, 205, 0);
    public static final Color TEARS = new Color(106, 188, 218);

    public void paint(Graphics smiley) {
        setBackground(Color.WHITE);

        /* Face */
        smiley.setColor(FACE);
        smiley.fillOval(100, 100, 500, 500);

        /* Eye Sclera */
        smiley.setColor(Color.WHITE);
        smiley.fillOval(220, 250, 80, 80);
        smiley.fillOval(400, 250, 80, 80);

        /* Eye Pupil */
        smiley.setColor(Color.BLACK);
        smiley.fillOval(240, 270, 40, 40);
        smiley.fillOval(420, 270, 40, 40);

        /* Teeth */
        smiley.setColor(Color.BLACK);
        smiley.fillOval(290, 390, 120, 120);
        smiley.setColor(Color.WHITE);
        smiley.fillArc(290, 390, 120, 120, 40, 100);

        /* Inner Mouth */
        smiley.setColor(Color.BLACK);
        int[] xMouth = { 305, 395, 350 };
        int[] yMouth = { 413, 413, 450 };
        smiley.fillPolygon(xMouth, yMouth, xMouth.length);

        /* Tears */
        smiley.setColor(TEARS);
        /* Create a triangle first. */
        int[] xTears = { 500, 530, 560 };
        int[] yTears = { 260, 175, 260 };
        smiley.fillPolygon(xTears, yTears, xTears.length);
        /* Then create a semicircle. */
        smiley.fillArc(500, 220, 60, 70, 360, -180);
    }
}