import java.awt.Button;
import java.awt.Label;
import java.applet.Applet;

/* <applet code = "ILoveNepal" height = "300" width = "300"></applet> */

public class ILoveNepal extends Applet {
    public void init() {
        Label question  = new Label ("Do you Love Nepal ?");
        add(question);

        Button answerOne = new Button("Yes, I love.");
        Button answerTwo = new Button("No, I am planning to love Australia.");

        add(answerOne);
        add(answerTwo);
    }
}