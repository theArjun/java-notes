import javax.swing.*;

class JFrameDemo extends JFrame {
    JFrameDemo(String title){
        super(title);
        setSize(300,300);
        setVisible(true);
        setLayout(new FlowLayout());

        JLabel label = new JLabel ("This is label");
        JButton button = new JButton("Click here");
        add(label);
        add(button);
    }

    public static void main(String[] args) {
        new JFrameDemo("JFrame Demo");
    }
}