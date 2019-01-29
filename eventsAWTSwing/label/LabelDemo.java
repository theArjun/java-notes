// Label provides meaning to the constructor.

import java.applet.*;
import java.awt.*;

/*
    <applet code = "LabelDemo" width = "200" height = "200"></applet>
*/

public class LabelDemo extends Applet{

    // Constructor of AWT Label Class. First three objects are created using default constructor and later setText() is evoked to set String.
    Label name = new Label();
    Label address = new Label();
    Label rollNo = new Label();
    // Let's add string here from constructor.
    Label grade = new Label("Grade");

    public void init(){
        
        // Setting the text to those labels.
        name.setText("Name");
        address.setText("Address");
        rollNo.setText("Roll No");

        // This adds to the container.
        add(name);
        add(address);
        add(rollNo);
        add(grade);
    }
}