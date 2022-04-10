import java.awt.*;
/* Event Handling Package */
import java.awt.event.*;

/* Need to implement ActionListener and override all methods. */
public class ActionListenerDemo extends Frame implements ActionListener {

    /* Class variables need to be setup at class scope; not class method's scope. */
    Label msg;
    Button button;

    ActionListenerDemo(String title) {

        super(title);

        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);

        msg = new Label("Click to generate event.");
        button = new Button("Event not generated");

        add(msg);
        add(button);

        /* Need to register the event for delegation */
        button.addActionListener(this);
    }

    /* Need to override the event */
    public void actionPerformed(ActionEvent ae) {
        msg.setText("Event generated");
    }

    /* I love Java but what's the point on describing main function ? */
    public static void main(String[] args) {
        new ActionListenerDemo("Action Listener Demo");
    }
}