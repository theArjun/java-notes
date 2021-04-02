import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class HaveFun extends JFrame{
    JButton button;
    JTextField text;

    public HaveFun(String title) {
        super(title);

        button = new JButton("Have Fun");
        text = new JTextField("Enter text here", 30);

        setSize(400,400);
        setVisible(true);
        setLayout(new FlowLayout());

        add(text);
        add(button);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                text.setText(text.getText().toUpperCase());
                text.setBackground(Color.RED);
                text.setForeground(Color.WHITE);
            }
        });
    }

    public static void main(String[] args) {
        new HaveFun("Have Fun ");
    }
}