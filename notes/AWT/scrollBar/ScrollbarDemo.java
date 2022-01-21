import java.awt.*;

public class ScrollbarDemo extends Frame {

    Scrollbar vertical, horizontal;

    ScrollbarDemo(String title) {
        super(title);

        setSize(400, 400);
        setLayout(new FlowLayout());
        setVisible(true);

        vertical = new Scrollbar(Scrollbar.VERTICAL);
        horizontal = new Scrollbar(Scrollbar.HORIZONTAL);

        add(new Label("Vertical Scrollbar"));
        add(vertical);
        add(new Label("Horizontal Scrollbar"));
        add(horizontal);

        /* int getValue() */
        System.out.println("Value of Vertical Scrollbar : " + vertical.getValue());
        System.out.println("Value of Horizontal Scrollbar : " + horizontal.getValue());

        /* int getMinimum()
        int getMaximum() */
        System.out.println("Maximum value  of Vertical Scrollbar : "+vertical.getMaximum());
        System.out.println("Minimum value  of Vertical Scrollbar : "+vertical.getMinimum());
        System.out.println("Maximum value  of Horizontal Scrollbar : "+horizontal.getMaximum());
        System.out.println("Minimum value  of Horizontal Scrollbar : "+horizontal.getMinimum());

        /* void setValue(int newValue) */
        vertical.setValue(70);
        horizontal.setValue(59);
        System.out.println("Value of Vertical Scrollbar : " + vertical.getValue());
        System.out.println("Value of Horizontal Scrollbar : " + horizontal.getValue());

    }

    public static void main(String[] args) {
        ScrollbarDemo obj = new ScrollbarDemo("Scroll Bar Demo");
    }
}

/* Other methods are best described with Events. */