import java.awt.*;

public class GridLayoutDemo extends Frame {
    public GridLayoutDemo(String title) {
        super(title);
        /* Sets the Grid Layout */
        setLayout(new GridLayout(2,3));
        add(new Button("Button One"));
        add(new Button("Button Two"));
        add(new Button("Button Three"));
        add(new Button("Button Four"));
        add(new Button("Button Five"));
        add(new Button("Button Six"));
    }

    public static void main(String[] args) {
        GridLayoutDemo obj = new GridLayoutDemo("Grid Layout");
        obj.setSize(300,300);
        obj.setVisible(true);
    }
}