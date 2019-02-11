import javax.swing.*;
import java.awt.*;

class JFrameDemoByAssociation {
    JFrame j;

    JFrameDemoByAssociation() {
        j = new JFrame();

        j.setSize(300, 300);
        j.setVisible(true);
        j.setLayout(new FlowLayout());

        JLabel label = new JLabel("This is label");
        j.add(label);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new JFrameDemoByAssociation();
    }
}