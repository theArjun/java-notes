import java.awt.*;

public class GridBagLayoutDemo extends Frame {
    public GridBagLayoutDemo (String title) {
        super(title);

        GridBagLayout gblOne = new GridBagLayout();
        GridBagConstraints gbcOne = new GridBagConstraints();
        setLayout(gblOne);


        Checkbox windows = new Checkbox("Windows",true);
        Checkbox android = new Checkbox("Android");
        Checkbox solaris = new Checkbox("Solaris");


        /* Define object of GridBagLayout */

        /* Use column weight of 1 */
        gblOne.weigtx = 1.0; 
        gblOne.ipadX = 200;
        gblOne.anchor = GridBagConstraints.NORTHEAST;
        gblOne.setConstraints(windows, gbcOne);
        gblOne.setConstraints(android, gbcOne);

        add(windows);
        add(android);
        add(solaris);

    }
    public static void main(String[] args) {
        GridBagLayoutDemo gblObject = new GridBagLayoutDemo("Arjun");
        gblObject.setSize (300,400);
        gblObject.setVisible(true);
    }
}