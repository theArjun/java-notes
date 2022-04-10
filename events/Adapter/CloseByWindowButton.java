import java.awt.*;
import java.awt.event.*;

public class CloseByWindowButton extends Frame {
    CloseByWindowButton(String title) {
        super(title);

        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout());

        /* Anonymous Class */
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new CloseByWindowButton("Close Window By Exit Button");
    }
}