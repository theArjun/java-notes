import java.awt.*;
import java.awt.event.*;

public class MouseListenerDemo extends Frame implements MouseListener {
    Label message;
    Frame frame;

    MouseListenerDemo(String title) {
        super(title);
        
        message = new Label("No Activity Yet");

        setSize(500,500);
        setLayout(new FlowLayout());
        setVisible(true);

        add(message);

        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        message.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent me) {
        message.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent me) {
        message.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent me) {
        message.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent me) {
        message.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseListenerDemo("Mouse Listener Demo");
    }
}