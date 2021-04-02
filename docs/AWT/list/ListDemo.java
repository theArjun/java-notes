import java.awt.*;

public class ListDemo extends Frame {

    List operatingSystem, browser;

    ListDemo(String title) {
        /* List( int numRows, boolean multipleSelect) throws HeadlessException */
        operatingSystem = new List(4, false); // Uni-select
        browser = new List(5, true); // Multi-select

        setSize(400, 400);
        setLayout(new FlowLayout());
        setVisible(true);

        operatingSystem.add("Windows");
        operatingSystem.add("Linux");
        operatingSystem.add("Android");
        operatingSystem.add("MacOS");

        browser.add("Mozilla");
        browser.add("Chrome");
        browser.add("Edge");
        browser.add("Opera");
        browser.add("Safari");

        add(new Label("Select your operating system : "));
        add(operatingSystem);
        add(new Label("Select your browser : "));
        add(browser);

        /* void add(String name , int index); */
        operatingSystem.add("Chrome OS",1); // Index starts from 0.
    }

    public static void main(String[] args) {
        ListDemo obj = new ListDemo("List Demo");
    }
}

/* Other methods are best described with events. */