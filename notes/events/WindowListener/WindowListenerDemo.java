import java.awt.*;
import java.awt.event.*;

public class WindowListenerDemo extends Frame implements WindowListener {
    Label message;

    WindowListenerDemo(String title) {
        super(title);

        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);

        message = new Label("No activity yet.");

        add(message);

        addWindowListener(this);
    }

    public void windowActivated(WindowEvent we) {
        message.setText("Window is activated");
    }

    public void windowClosed(WindowEvent we) {
        message.setText("Window is closed");
    }

    public void windowClosing(WindowEvent we) {
        message.setText("Window is closing");
        System.exit(0);
    }

    public void windowDeactivated(WindowEvent we) {
        message.setText("Window is deactivated");
    }

    public void windowIconified(WindowEvent we) {
        message.setText("Window is iconified");
    }

    public void windowDeiconified(WindowEvent we) {
        message.setText("Window is deiconified");
    }

    public void windowOpened(WindowEvent we) {
        message.setText("Window is opened");
    }

    public static void main(String[] args) {
        new WindowListenerDemo("Window Listener Demo");
    }
}