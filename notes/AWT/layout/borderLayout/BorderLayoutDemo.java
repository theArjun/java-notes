import java.awt.*;

public class BorderLayoutDemo extends Frame {

    BorderLayoutDemo(String title){
        setSize(400,400);
        setVisible(true);
        setLayout(new BorderLayout());

        add(new Button("This is North"),BorderLayout.NORTH);
        add(new Button("This is West"),BorderLayout.WEST);
        add(new Button("This is East"),BorderLayout.EAST);
        add(new Button("This is South"),BorderLayout.SOUTH);
        add(new Button("This is Center"),BorderLayout.CENTER);


    }

    public static void main(String[] args) {
        new BorderLayoutDemo("Border Layout Demo");
    }
}