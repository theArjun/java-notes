import java.awt.*;

public class BorderDemo extends Frame{
    public BorderDemo (String title) {
        /* Passing title to the parent constructor */
        super(title);
        /* Setting a new Border Layout */
        setLayout(new BorderLayout());
        /* Adding Buttons */
        add(new Button("North"), BorderLayout.NORTH);
        add(new Button("West"), BorderLayout.WEST);
        add(new Button("Center"), BorderLayout.CENTER);
        add(new Button("East"), BorderLayout.EAST);
        add(new Button("South"), BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        /* Creating a object and passing title to the constructor */
        BorderDemo objOne = new BorderDemo("Border Demo");
        /* Setting size for Frame */
        objOne.setSize(300,200);
        /* Making buttons visible  */
        objOne.setVisible(true);

    }
}