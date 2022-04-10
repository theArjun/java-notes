import java.awt.*;

public class FlowLayoutDemo extends Frame {

    FlowLayoutDemo(String Title) {
        setSize(300,400);
        setVisible(true);
        /* Default layout, though. */
        setLayout(new FlowLayout());

        add(new Label("Requirements of ID Card"));
        add(new Label("Name "));
        add(new Label("Address"));
        add(new Label("College "));
        add(new Label("Roll No "));
    }

    public static void main(String[] args) {
        new FlowLayoutDemo("Flow Layout Demo");
    }

}