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

## The HTML APPLET Tag

Syntax :

        <Applet
        [CODEBASE = codebaseURL]
        CODE = appletFile
        [ALT = alternateText]
        [NAME = appletInstanceName]
        Width = pixels
        height = pixels
        [ALIGN = alignment]
        [VSPACE = pixels]
        [HSPACE = pixels]
        >

        [< PARAM NAME = attributeName VALUE = AttributeValue>]  >> Important for Exam 💯
        [HTML Displayed in the absence of Java]

        </APPLET>

Note : [ ] ⏩ Optional

### **CODEBASE**
- It is an optional attribute that specifies the base URL of the applet code, which is the directory that will be searched for the applets executable class file.
- The HTML Document URL Directory is used as the CODEBASE if this attribute is not specified.

### **CODE**
- Code is the required attribute that gives the name of file containing compiled .class file. This file is related to the code base UTL of the applet.


### **ALT**
- The ALT tag is an alternate tag used to specify a short text message that should be displayed if the browser recognized the applet tag but can't currently run JAVA applet.

### **NAME**
- NAME is an optional attribute used to specify a name for the applet instance. NAME attribute is used in order to communicate between applets on the same page.

### **WIDTH and HEIGHT**
- WIDTH and HEIGHT are the required attributes that gives the size of the applet display area.
  
### **ALIGN**
- ALIGN is an optional attribute that specifies the alignment of the applet. The possible values are LEFT, RIGHT, TOP, BOTTOM, MIDDLE, BASELINE, TEXTTOP, ABSMIDDLE (Absolute Middle) and ABSBOTTOM (Absolute Bottom).

### **VSPACE and HSPACE**
- These attributes are optinal. 
- VSPACE specifies the space in pixel and below the applet.
- HSPACE specifies the space in pixel on each sides of the applet.

### **PARAM NAME and VALUE**
- PARAMNAME is a tag used to specify applet specific arguments.
- Applets access their attributes with the ```getParameter( )``` 

