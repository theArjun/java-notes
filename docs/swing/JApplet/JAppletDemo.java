import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* 
    <applet code = "JAppletDemo" height = "300" width = "300"></applet>
*/

public class JAppletDemo extends JApplet {

    JTextField numberOneBox, numberTwoBox, sumBox;
    JButton button;

    public void init() {

        numberOneBox = new JTextField(10);
        /* setBounds(x, y, width, height) */
        // numberOneBox.setBounds(30, 40, 150, 30);
        numberTwoBox = new JTextField(10);
        /* Layout is preferred. */
        setLayout(new FlowLayout());

        button = new JButton("Add");

        add(numberOneBox);
        add(numberTwoBox);
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int numOne = Integer.parseInt(numberOneBox.getText());
                int numTwo = Integer.parseInt(numberTwoBox.getText());

                button.setText(numOne + numTwo + "");
            }
        });
    }
}