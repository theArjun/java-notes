import java.awt.*;
import java.applet.*;
/*
	<applet code = "DisplayImage" height = "400" width = "400"></applet>
*/

public class DisplayImage extends Applet {

	public Image picture;

	public void init() {
		picture = getImage(getDocumentBase(), "blue.jpg");
	}

	public void paint(Graphics g){
		g.drawImage(picture,30,30,this
	}
}