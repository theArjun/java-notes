import java.awt.*;
import java.awt.event.*;

/* <applet code = "FrameCloseDemo" height = "300" width = "300"></applet> */

public class FrameCloseDemo {
    public static void main(String[] args) {
        Frame frame = new Frame ("Close Operation Frame");
        Label label = new Label ("Testing close operation");

        frame.add(label);
        frame.setSize(400,400);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}