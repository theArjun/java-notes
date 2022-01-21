import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code = "AdapterDemo" height = "300" width = "300" ></applet>*/

public class AdapterDemo extends Applet {
    public void init() {
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
    }
}

class MyMouseAdapter extends MouseAdapter {
    AdapterDemo adapterDemo;
    public MyMouseAdapter (AdapterDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }

    /* Handle Mouse Clicked */
    public void mouseClicked(MouseEvent me) {
        adapterDemo.showStatus("Mouse Clicked");
    }
}

class MyMouseMotionAdapter extends MouseMotionAdapter {
    AdapterDemo adapterDemo;
    public MyMouseMotionAdapter (AdapterDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }

    /* Handle mouse dragged */
    public void mouseDragged (MouseEvent me) {
        adapterDemo.showStatus("Mouse Dragged");
    }
}