import java.awt.*;
import java.net.*; // For URL objects
import java.applet.*;

/*
	<applet code = "PlayAudio" height = "400" width = "400">
		<param name = "audioURL" value = "sample.wav">
	</applet>

*/

// AppletContext is an environment (interface) which helps to communicate with outer-environment and deal with media files such as audio, image.

public class PlayAudio extends Applet {
	public AudioClip myMusic; // Defining a variable of data type AudioClip.
	public AppletContext context;

	public void init() {
		context = this.getAppletContext();
		String audioURL = this.getParameter("audioURL"); // This gets the parameter passed from applet.
		if (audioURL == null) {
			audioURL = "sample.wav"; // If no parameter is passed.
		}

		try {
			URL myURL = new URL(this.getDocumentBase(), audioURL); // New URL object storing audio URL passed by user.
			myMusic = context.getAudioClip(myURL);
			// myMusic = this.getAudioClip(myURL); // Also can be done like this.
		} catch (MalformedURLException exc) {
			exc.printStackTrace();
			context.showStatus("Couldn't load audio file."); // Showing status to the Browser status bar.
		}
	}

	public void start() { // When Applet starts
		if (myMusic != null) {
			myMusic.loop();
		}
	}

	public void stop() { // When Applet stop
		if (myMusic != null) {
			myMusic.stop();
		}
	}
}
