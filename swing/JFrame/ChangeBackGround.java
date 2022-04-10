import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.event.*;

public class ChangeBackGround extends JFrame {

    JButton button;
    Random rand;
    Color color;

    ChangeBackGround(String title) {
        super(title);

        rand = new Random();

        setSize(400, 400);
        setLayout(new FlowLayout());
        setVisible(true);

        getContentPane().setBackground(Color.RED);

        button = new JButton("Change Background Color");
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
                getContentPane().setBackground(color);
                System.out.println("Color Value : " + color);
            }
        });
    }

    public static void main(String[] args) {
        new ChangeBackGround("Change Background With Swing");
    }
}