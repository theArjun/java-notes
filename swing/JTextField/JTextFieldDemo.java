import javax.swing.*;
import java.awt.*;

public class JTextFieldDemo extends JFrame {

    JTextField jOne;

    JTextFieldDemo(String title) {
        super(title);

        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout());

        jOne = new JTextField("This is default");
        add(jOne);
    }

    public static void main(String[] args) {
        new JTextFieldDemo("JTextField Demo ");
    }
}