/* 
    <applet code = "Alignment" height = "300" width = "300"></applet>
*/

import java.awt.Label;
import java.applet.Applet;

public class Alignment extends Applet {
    public void init () {
        Label leftAlignedLabel = new Label("Left Aligned Label");
        Label centerAlignedLabel = new Label("Center Aligned Label");
        Label rightAlignedLabel = new Label("Right Aligned Label");

        /* The possible alignment values are  Label.LEFT, Label.RIGHT, and Label.CENTER.*/

        leftAlignedLabel.setAlignment(Label.LEFT);
        centerAlignedLabel.setAlignment(Label.CENTER);
        rightAlignedLabel.setAlignment(Label.RIGHT);

        add(leftAlignedLabel);
        add(centerAlignedLabel);
        add(rightAlignedLabel);
    }
}