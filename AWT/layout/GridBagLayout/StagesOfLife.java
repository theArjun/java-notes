import java.awt.*;

public class StagesOfLife extends Frame {
    StagesOfLife(String title) {
        super(title);

        setSize(500, 500);
        setVisible(true);

        /* This is mandatory. */
        GridBagConstraints size = new GridBagConstraints();

        setLayout(new GridBagLayout());

        /* Creating buttons */
        Button birth = new Button("Birth");
        Button study = new Button("Study");
        Button work = new Button("Work");
        Button marriage = new Button("Marriage");
        Button children = new Button("Children");
        Button retirement = new Button("Retirement");
        Button death = new Button("Death");
        Button life = new Button("Stages of Life");
        Button message = new Button("Your life goes this way");

        /* Gridx  denotes X position*/
        size.gridx = 0;
        /* Gridy denotes Y position */
        size.gridy = 0;
        /* gridheight denotes height of component */
        size.gridheight = 8;
        /* Fills vertically to given height : 8 */
        size.fill = GridBagConstraints.VERTICAL;
        /* Syntax to add with GridBagConstraints*/
        add(life, size);

        size.gridx = 1;
        size.gridy = 1;
        size.gridheight = 1;
        add(death, size);

        size.gridx = 2;
        size.gridy = 2;
        size.gridheight = 1;
        add(retirement, size);

        size.gridx = 3;
        size.gridy = 3;
        size.gridheight = 1;
        add(children, size);

        size.gridx = 4;
        size.gridy = 4;
        size.gridheight = 1;
        add(marriage, size);

        size.gridx = 5;
        size.gridy = 5;
        size.gridheight = 1;
        add(work, size);

        size.gridx = 6;
        size.gridy = 6;
        size.gridheight = 1;
        add(study, size);

        size.gridx = 7;
        size.gridy = 7;
        size.gridheight = 1;
        add(birth, size);

        size.gridx = 0;
        size.gridy = 8;
        size.gridheight = 1;
        size.gridwidth = 8;
        size.fill = GridBagConstraints.HORIZONTAL;
        add(message,size);
    }

    public static void main(String[] args) {
        new StagesOfLife("Grid Bag Constraints Demo");
    }
}