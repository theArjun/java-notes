# Applet Programming

- An applet is a Java program that runs in a wen browser.
- An applet is a Java class that extends the ```java.applet.Applet```.
- No ```main()``` method
- Applet was designed to be embedded with a HTML page.
- JVM is required to view an applet.
- Applet have strict security rules that are enforced by the web browser.

## Two types of Applet

1. Based on Applet class
   - These Applets use the Abstract Window Toolkit (```AWT```) to provide the graphical user interface (GUI).
   - The style of applet has been available since Java was first created.
2. Based on ```JApplet``` class
    - They are based on the Swing class ```JApplet``` which inherits Applet.
    - Swing applet use the swing classes to provide the GUI.

## Life Cycle of Applet

![Life Cycle of Applet](http://www.startertutorials.com/corejava/wp-content/uploads/2016/02/applet-life-cycle.png)

## Applet Initialization and Termination
- When an applet begins ,the following methods are called in this sequence :
1. ```init()```
2. ```start()```
3. ```paint()```
Whenever an applet is terminated, the following sequence of methods calls takes place.
4. ```stop()```
5. ```destroy()```

### Description :

1. ```init()```
- The ```init( )``` method is the first method to be called. This is where you should initialize variables. This method is called only once during the run time of your applet.

2. ```start()```
- The ```start( )``` method is called after ```init( )```. It is also called to restart an applet after it has been stopped. Whereas ```init( )``` is called once—the first time an applet is loaded—```start( )``` is called each time an applet’s HTML document is displayed onscreen. So, if a user leaves a web page and comes back, the applet resumes execution at ```start( )```.

3. ```paint()```
- The ```paint( )``` method is called each time an AWT-based applet’s output must be redrawn. This situation can occur for several reasons. Whatever the applet must redraw its output, ```paint( )``` method is called. The ```paint( )``` method has one parameter of type Graphics.

4. ```stop()```
- The ```stop( )``` method is called when a web browser leaves the HTML document containing the applet—when it goes to another page, for example. When ```stop( )``` is called, the applet  is probably running. You should use ```stop( )``` to suspend threads that don’t need to run when the applet is not visible. You can restart them when ```start( )``` is called if the user returns to the page.

5. ```destroy()```
- The ```destroy( )``` method is called when the environment determines that your applet needs to be removed completely from memory. At this point, you should free up any resources the applet may be using. The ```stop( )``` method is always called before ```destroy( )```.