# Playing Audio in Applet

An applet can play an audio file represented by the AudioClip interface in the java.applet package. The AudioClip interface has three methods, including :  
```public void play()``` − Plays the audio clip one time, from the beginning.  
```public void loop()``` − Causes the audio clip to replay continually.  
```public void stop()``` − Stops playing the audio clip.  
To obtain an AudioClip object, you must invoke the getAudioClip() method of the Applet class. The getAudioClip() method returns immediately, whether or not the URL resolves to an actual audio file. The audio file is not downloaded until an attempt is made to play the audio clip.  