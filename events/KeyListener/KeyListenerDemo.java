import java.awt.*;
import java.awt.event.*;

public class KeyListenerDemo extends Frame implements KeyListener {
    Label message;
    Label activity;

    KeyListenerDemo(String title) {
        super(title);

        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);

        message = new Label("No Activity yet.");
        activity = new Label("Key Pressed : ");

        add(message);
        add(activity);

        addKeyListener(this);
    }

    /* Keys like Shift make this method envoked. */
    public void keyPressed(KeyEvent ke) {
        message.setText("Key is pressed");
    }

    public void keyReleased(KeyEvent ke) {
        message.setText("Key is released");
    }

    public void keyTyped(KeyEvent ke) {
        message.setText("Key is typed");
        activity.setText("Key Pressed : " + ke.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyListenerDemo("Key Listener Demo");
    }
}