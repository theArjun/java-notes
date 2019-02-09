import java.awt.*;

public class CheckBoxDemo extends Frame {
    CheckBoxDemo(String title) {

        super(title);
        setSize(400, 400);
        setVisible(true);
        setLayout(new GridLayout(4,1));

        // b is lowercase in Checkbox.

        Label hobbies = new Label("Select your hobbies :");
        Checkbox swimming = new Checkbox("Swimming");
        Checkbox cycling = new Checkbox("Cycling");
        Checkbox writing = new Checkbox("Writing");

        add(hobbies);
        add(swimming);
        add(cycling);
        add(writing);

        cycling.setLabel("Check for Swimming");
        cycling.setState(false);

        System.out.println("Swimming State : "+swimming.getState());
        System.out.println("Swimming Label : "+swimming.getLabel());
    }

    public static void main(String[] args) {
        CheckBoxDemo obj = new CheckBoxDemo("Check Box Demo");
    }
}