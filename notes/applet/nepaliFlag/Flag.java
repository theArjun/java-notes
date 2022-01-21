import java.applet.*;
import java.awt.*;

/*
	<applet code = "Flag" width = "500" height = "500"></applet>
*/

public class Flag extends Applet {

	static Color NEPALIFLAG = new Color(221, 12, 39); // Defines custom color

	public void paint(Graphics flag) {

		// Figure starts from (210,10)

		// For upper traingle
		int upperTriangleX[] = { 210, 360, 210 }; // +150 for upper triangle
		int upperTriangleY[] = { 10, 160, 160 };
		// g.drawPolygon(upperTriangleX,upperTriangleY,3); // Also can be drawn like
		// this.
		Polygon upperTriangle = new Polygon(upperTriangleX, upperTriangleY, 3);
		flag.drawPolygon(upperTriangle);
		flag.setColor(NEPALIFLAG); // Setting color of our brave Gorkha Soldiers Blood
		flag.fillPolygon(upperTriangle);

		// For lower traingle
		int lowerTriangleX[] = { 210, 390, 210 }; // +180 for lower triangle
		int lowerTriangleY[] = { 160, 340, 340 };
		Polygon lowerTriangle = new Polygon(lowerTriangleX, lowerTriangleY, 3);
		flag.drawPolygon(lowerTriangle);
		flag.setColor(NEPALIFLAG);
		flag.fillPolygon(lowerTriangle);

		// For standing rod
		int rodX[] = { 207, 210, 210, 207 };
		int rodY[] = { 7, 7, 500, 498 };
		Polygon rod = new Polygon(rodX, rodY, 4);
		flag.drawPolygon(rod);
		flag.setColor(Color.black);
		flag.fillPolygon(rod);

		// For borders
		int borderX[] = { 210, 210, 360, 210, 390, 210, 210, 396, 216, 366 }; // 3 units
		int borderY[] = { 7, 10, 160, 160, 340, 340, 343, 343, 163, 163 };
		Polygon border = new Polygon(borderX, borderY, 10);
		flag.drawPolygon(border);
		flag.setColor(Color.blue);
		flag.fillPolygon(border);

		// For moon
		// One Oval overlaps other Oval to form a Crescent moon; I was unable to learn
		// drawArc() at this moment.

		flag.setColor(Color.white);
		flag.fillOval(240, 100, 30, 30); // Synatx : fillOval(int xPosition, int yPosition, width, height)
		flag.setColor(NEPALIFLAG);
		flag.fillOval(240, 91, 30, 30);

		// For star
		int starX[] = { 240, 250, 255, 260, 270, 265, 270, 260, 255, 250, 240, 245 };
		int starY[] = { 260, 260, 250, 260, 260, 270, 280, 280, 290, 280, 280, 270 }; // Starting is 240
		Polygon star = new Polygon(starX, starY, 12);
		flag.drawPolygon(star);
		flag.setColor(Color.white);
		flag.fillPolygon(star);
	}
}