import java.awt.*;
import java.awt.event.*;

public class DialogDemo extends Window{

    Dialog d;
    public DialogDemo() {
        Frame f = new Frame();
        f.setVisible(true);
        d = new Dialog(f, "Dialog Example", true);
        d.setLayout(new FlowLayout());
        Button button = new Button("OK");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                d.setVisible(false);
            }
        });
        d.add(new Label("Click button to continue"));
        d.add(button);
        d.setSize(200,200);
        d.setVisible(true);
    }
    public static void main(String[] args) {
        new DialogDemo();
    }
}