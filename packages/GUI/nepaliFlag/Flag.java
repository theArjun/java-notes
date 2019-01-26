import java.applet.*;
import java.awt.*;

/*
	<applet code = "Flag" width = "300" height = "300"></applet>
*/


public class Flag extends Applet{

	public void paint(Graphics flag){

		// For upper traingle
		int upperTriangleX[] = {50,100,50};
		int upperTriangleY[] = {50,100,100};
		// g.drawPolygon(upperTriangleX,upperTriangleY,3); // Also can be drawn like this.
		Polygon upperTriangle = new Polygon(upperTriangleX,upperTriangleY,3);
		flag.drawPolygon(upperTriangle);
		flag.setColor(Color.red);
		flag.fillPolygon(upperTriangle);

		// For lower traingle 
		int lowerTriangleX[] = {50,110,50};
		int lowerTriangleY[] = {100,160,160};
		Polygon lowerTriangle = new Polygon(lowerTriangleX,lowerTriangleY,3);
		flag.drawPolygon(lowerTriangle);
		flag.setColor(Color.red);
		flag.fillPolygon(lowerTriangle);

		// For standing rod
		int rodX[] = {48,50,50,48};
		int rodY[] = {48,48,250,248};
		Polygon rod = new Polygon(rodX,rodY,4);
		flag.drawPolygon(rod);
		flag.setColor(Color.black);
		flag.fillPolygon(rod);

		// For borders
		int borderX[] = {50,50,100,50,110,50,50,114,54,104};
		int borderY[] = {48,50,100,100,160,160,162,162,102,102};
		Polygon border = new Polygon(borderX,borderY,10);
		flag.drawPolygon(border);
		flag.setColor(Color.blue);
		flag.fillPolygon(border);

		// For moon		
		flag.setColor(Color.white);
		flag.fillOval(60,80,15,10);
		flag.setColor(Color.red);
		flag.fillOval(60,77,15,10);

		// For star
		int starX[] = {60,65,67,69,74,69,67,65};
		int starY[] = {140,138,133,138,140,142,147,142};
		Polygon star = new Polygon(starX,starY,8);
		flag.drawPolygon(star);
		flag.setColor(Color.white);
		flag.fillPolygon(star);
	}
}