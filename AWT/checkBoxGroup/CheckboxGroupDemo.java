import java.awt.*;

public class CheckboxGroupDemo extends Frame {

    Checkbox windows, linux, macOS;
    CheckboxGroup operatingSystem;
    Label message;

    CheckboxGroupDemo(String title) {
        super(title);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setVisible(true);

        message = new Label("Choose your operating system :", Label.CENTER);

        operatingSystem = new CheckboxGroup();

        windows = new Checkbox("Windows", operatingSystem, true);
        linux = new Checkbox("Linux", operatingSystem, false);
        macOS = new Checkbox("MacOS", operatingSystem, false);

        add(message);
        add(windows);
        add(linux);
        add(macOS);
    }

    public static void main(String[] args) {
        CheckboxGroupDemo obj = new CheckboxGroupDemo("Check Box Group Demo");
    }
}
