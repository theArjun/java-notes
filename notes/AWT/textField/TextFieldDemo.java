import java.applet.Applet;
import java.awt.TextField;
import java.awt.Label;

/* <applet code = "TextFieldDemo" height = "300" width = "300"></applet> */

public class TextFieldDemo extends Applet {
    public void init() {
        TextField name = new TextField("Enter your name",32); // Sets the text and size of column
        TextField address = new TextField("Enter your address"); // Sets only text
        TextField age = new TextField(3); // Sets only size

        add(name);
        add(address);
        add(age);
        
    }
}