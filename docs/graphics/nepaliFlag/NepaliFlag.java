import java.awt.*;
import java.applet.*;
/*
	<applet code = "NepaliFlag" height = "600" width = "600"></applet>
*/

public class NepaliFlag extends Applet {

	public Image picture;

	public void init() {
		picture = getImage(getDocumentBase(), "nepal.png");
	}

	public void paint(Graphics flag){
		setBackground(Color.WHITE);
        flag.drawImage(picture,0,0,this);
        showStatus("बिर नेपाली को झन्डा ");
	}
}