import java.awt.*;

public class Directions extends Frame {
    Directions(String title) {
        super(title);

        setSize(400,400);
        setVisible(true);

        /* GridLayout()
        GridLayout(int rows, int cols)
        GridLayout(int rows, int cols, int hgap, int vgap) */

        setLayout(new GridLayout(3,3));

        add(new Button("Top Left"));
        add(new Button("Top"));
        add(new Button("Top Right"));
        add(new Button("Left"));
        add(new Button("Center"));
        add(new Button("Right"));
        add(new Button("Botton Left"));
        add(new Button("Bottom"));
        add(new Button("Bottom Right"));
    }
    public static void main(String[] args) {
        new Directions("Grid Layout Demo");
    }
}