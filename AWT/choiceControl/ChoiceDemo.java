import java.awt.*;

public class ChoiceDemo extends Frame {

    Choice operatingSystem, browser;
    Label osMessage, browserMessage;

    ChoiceDemo(String title) {
        super(title);

        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout());

        operatingSystem = new Choice();
        operatingSystem.add("Windows");
        operatingSystem.add("Solaris");
        operatingSystem.add("Android");
        operatingSystem.add("Mac OS");

        browser = new Choice();
        browser.add("Chrome");
        browser.add("Firefox");
        browser.add("Opera");
        browser.add("Edge");

        osMessage = new Label("Choose your operating system : ");
        browserMessage = new Label("Choose your browser : ");

        add(osMessage);
        add(browserMessage);
        add(operatingSystem);
        add(browser);

        System.out.println("Total Operating Systems : " + operatingSystem.getItemCount());

    }

    public static void main(String[] args) {
        ChoiceDemo obj = new ChoiceDemo("Choice Demo");
    }
}
/* Other methods are best described with events. */