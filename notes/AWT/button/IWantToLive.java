import java.awt.Button;
import java.applet.Applet;
import java.awt.Label;

/* <applet code = "IWantToLive" height = "300" width = "300"></applet> */

public class IWantToLive extends Applet {
    public void init() {
        Label wannaLive = new Label("Do you want to Live ? ",Label.LEFT);
        Button iwantToLive = new Button("Yes");
        Label wannaDie = new Label("Do you want to Die ? ",Label.RIGHT);
        Button iwantToDie = new Button("Yes");

        add(wannaLive);
        add(iwantToLive);
        add(wannaDie);
        add(iwantToDie);

        iwantToDie.setEnabled(false); // Disable the click

    }
}