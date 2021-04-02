import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class Calculator extends JFrame {

    JTextField one, two;
    JButton sum, sub;
    JLabel result;

    public Calculator(String title){
        super(title);
        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);

        one = new JTextField(30);
        two = new JTextField(30);

        sum = new JButton("Sum");
        sub = new JButton("Sub");

        result = new JLabel("The result is : ");

        add(one);
        add(two);
        add(sum);
        add(sub);
        add(result);

        sum.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                result.setText("Addition : " + (Integer.parseInt(one.getText()) + Integer.parseInt(two.getText())));
            }
        });

        sub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                result.setText("Subtraction : " + (Integer.parseInt(one.getText()) - Integer.parseInt(two.getText())));
            }
        });
    }

    public static void main(String[] args) {
        new Calculator("Calculator");
    }
}