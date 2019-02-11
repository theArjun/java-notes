import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MultiCastEvent extends JPanel implements ActionListener {
    private int counter = 0;
    private JButton closeAllButton;

    public MultiCastEvent() {
        JButton newButton = new JButton("New");
        add(newButton);
        newButton.addActionListener(this);
        closeAllButton = new JButton("Close All");
        add(closeAllButton);
    }

    public void actionPerformed(ActionEvent ae) {
        CloseFrame f = new CloseFrame();
        counter++;
        f.setTitle("Window"+ counter);
        f.setSize(200,150);
        f.setLocation(30*counter,30*counter);
        f.setVisible(true);
        closeAllButton.addActionListener(f);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("MutiCastTest");
        frame.setSize(300,300);
        Container contentPane = frame.getContentPane();
        contentPane.add(new MultiCastEvent());
        frame.setVisible(true);
    }

    class CloseFrame extends JFrame implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
        }
    }
}
