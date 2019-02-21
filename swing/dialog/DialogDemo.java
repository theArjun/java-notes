import javax.swing.JOptionPane;

public class DialogDemo {
    DialogDemo () {
        JOptionPane.showMessageDialog(null, "Message Box", "This is sample message", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        new DialogDemo();
    }
}