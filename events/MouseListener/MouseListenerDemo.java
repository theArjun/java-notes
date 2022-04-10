import java.awt.*;
import java.awt.event.*;

public class MouseListenerDemo extends Frame implements MouseListener {
    Label message, position;
    Frame frame;
    String posX, posY;

    MouseListenerDemo(String title) {
        super(title);

        message = new Label("No Activity Yet");
        position = new Label("Position at : (" + posX + "," + posY + ")");

        setSize(500, 500);
        setLayout(new FlowLayout());
        setVisible(true);

        add(message);
        add(position);

        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        message.setText("Mouse Clicked");
        position.setText("Position at : (" + me.getX() + "," + me.getY() + ")");
    }

    public void mousePressed(MouseEvent me) {
        message.setText("Mouse Pressed");
        position.setText("Position at : (" + me.getX() + "," + me.getY() + ")");
    }

    public void mouseReleased(MouseEvent me) {
        message.setText("Mouse Released");
        position.setText("Position at : (" + me.getX() + "," + me.getY() + ")");
    }

    public void mouseEntered(MouseEvent me) {
        message.setText("Mouse Entered");
        position.setText("Position at : (" + me.getX() + "," + me.getY() + ")");
    }

    public void mouseExited(MouseEvent me) {
        message.setText("Mouse Exited");
        position.setText("Position at : (" + me.getX() + "," + me.getY() + ")");
    }

    public static void main(String[] args) {
        new MouseListenerDemo("Mouse Listener Demo");
    }
}