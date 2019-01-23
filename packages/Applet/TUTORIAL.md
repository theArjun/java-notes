# How to run an Applet?

There are two ways to run an applet :

1. By HTML file.  
2. By appletViewer tool (for testing purpose).

## Simple example of Applet by HTML file:

To execute the applet by HTML file, create an applet and compile it. After that create an html file and place the applet code in HTML file. Now click the HTML file.

    //HelloApplet.java  
    import java.applet.Applet;  
    import java.awt.Graphics;  
    public class HelloApplet extends Applet{  
         public void paint(Graphics g){  
            g.drawString("welcome",150,150);  
        }  
      
    }  

>Note:  

Class must be public because its object is created by Java Plugin software that resides on the browser.
HelloApplet.html

    <html>
        <title>Applet's Demonstration</title>  
        <body>  
            <applet code="HelloApplet.class" width="300" height="300">  
            </applet>  
        </body>  
    </html>  

## Simple example of Applet by appletviewer tool:

To execute the applet by appletviewer tool, create an applet that contains applet tag in comment and compile it. After that run it by: appletviewer HelloApplet.java. Now HTML file is not required but it is for testing purpose only.

    //HelloApplet.java  
    import java.applet.Applet;  
    import java.awt.Graphics;  
    public class HelloApplet extends Applet{  
        public void paint(Graphics g){  
            g.drawString("welcome to applet",150,150);  
        }  
    } 

To execute the applet by appletviewer tool, write in command prompt:

        c:\>javac HelloApplet.java  
        c:\>appletviewer HelloApplet.java
