import java.awt.*;
import java.applet.*;

// This HTML chunk is for passing parameter to appletviewer.

/*
	<applet code = "Introduction" height = "200" width = "500">
		<param name = "fontName" value = "Tahoma">
		<param name = "fontSize" value = "16">
		<param name = "title" value = "Introduction">
		<param name = "message" value = " >> I read in Gandaki College of Information and Science.">
	</applet>
*/

public class Introduction extends Applet{
	String param;
	String fontName;
	String title;
	String message;
	int fontSize;

	// We are defining our custom font. So, font object is created.
	Font myFont;


	public void init()
	{

		fontName = getParameter("fontName");
		if(fontName == null)
		{
			fontName = "TimesRoman";
		}

		title = getParameter("title");
		if(title == null)
		{
			title = "Untitled";
		}

		message = getParameter("message");
		if(message == null)
		{
			message = "Write your description here.";
		}

		param = getParameter("fontSize");
		try{
			if(param != null)
			{
				fontSize = Integer.parseInt(param);
			}
			else
			{
				fontSize = 10;
			}
		}catch(NumberFormatException exc)
		{
			fontSize = 15;
		}
	}

	public void paint(Graphics g)
	{
		// Font object Syntax  : Font(font_name, Font.font_type, font_size);  

		myFont = new Font(fontName,Font.BOLD,fontSize);
		g.setFont(myFont); // Setting the defined font for this object.
		setBackground(Color.red); // Setting background color.
		setForeground(Color.white); // Setting foreground color.
 
		g.drawString(title,20,50); 
		myFont = new Font(fontName,Font.PLAIN,fontSize); // Defining new font-style for displaying message. 
		g.setFont(myFont); // Setting the new font.
		g.drawString(message,20,80);
	}	
}