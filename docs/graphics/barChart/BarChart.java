import java.awt.*;
import java.applet.*;

/* <applet code = "BarChart" height = "600" width = "600"></applet> */

public class BarChart extends Applet {
    
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawLine(100,0,100,600);
        g.drawLine(0,500,600,500);

        g.setColor(Color.RED);
        g.drawRect(200,200,50,300);
        g.fillRect(200,200,50,300);
        g.setColor(Color.BLUE);
        g.drawRect(300,300,50,200);
        g.fillRect(300,300,50,200);

        setForeground(Color.BLACK);
        g.drawString("Boys",200,520);
        g.drawString("Girls",300,520);
        g.drawString("51", 210, 180);
        g.drawString("38", 310, 280);

        g.drawString("fig : Total Number of Students Appearing in Java Examination", 150, 570);
    }
}