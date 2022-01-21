import java.awt.*;
import java.applet.Applet;

public class FlowLayout extends Applet{
    Button buttonOne, buttonTwo, buttonThree;

    public void init() {
        buttonOne = new Button("ok");
        buttonTwo = new Button("Open");
        buttonThree = new Button("Close");

        setLayout(new FlowLayout());
        add(buttonOne);
        add(buttonTwo);
        add(buttonThree);
    }
}