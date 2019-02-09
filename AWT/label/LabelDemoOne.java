import java.awt.*;
import java.applet.*;

/* <applet code = "LabelDemoOne" height = "300" width = "300"></applet> */

public class LabelDemoOne extends Applet 
{
    
    public void init()
    {
        Label name = new Label("Name : Arjun", Label.LEFT);
        Label address = new Label("Address : LA, California, United States",Label.CENTER);
        Label phoneNumber = new Label("Phone Number : +123456436",Label.CENTER);
        Label college = new Label("College : MIT",Label.RIGHT);

        add(name);
        add(address);
        add(phoneNumber);
        add(college);

    }
}