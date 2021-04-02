import javax.swing.JFrame;

public class ShowColors {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Using Colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorJPanel colorJPanel = new ColorJPanel();
        frame.add(colorJPanel);
        frame.setSize(400,180);
        frame.setVisible(true);
    }
}