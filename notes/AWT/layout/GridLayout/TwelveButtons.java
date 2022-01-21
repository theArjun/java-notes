import java.awt.*;

public class TwelveButtons extends Frame {

    TwelveButtons(String title) {
        super(title);

        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(3,4));

        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
        add(new Button("7"));
        add(new Button("8"));
        add(new Button("9"));
        add(new Button("10"));
        add(new Button("11"));
        add(new Button("12"));
    }


    public static void main(String[] args) {
        new TwelveButtons("12 Buttons");
    }
}