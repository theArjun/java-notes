import java.awt.*;
import java.awt.event.*;

public class MouseMotionListenerDemo extends Frame implements MouseMotionListener {
    Label message;
    Label position;

    MouseMotionListenerDemo(String title) {
        super(title);

        setSize(400, 400);
        setLayout(new FlowLayout());
        setVisible(true);

        message = new Label("No Activity Yet.");
        position = new Label("Position : ");

        add(message);
        add(position);

        addMouseMotionListener(this);
    }

    public void mouseDragged(MouseEvent me) {
        message.setText("Mouse Dragged.");
        position.setText("Position : " + me.getX() + "," + me.getY() + ")");
    }

    /* getX() gives co-ordinates of Absolute Window, not of frame window. */
    public void mouseMoved(MouseEvent me) {
        message.setText("Mouse Moved.");
        position.setText("Position : " + me.getX() + "," + me.getY() + ")");
    }

    public static void main(String[] args) {
        new MouseMotionListenerDemo("MouseMotion Listener Demo");
    }
}