# Event, Event Handling & AWT/Swing

Also called ```javafx JFx```
 
## AWT ( abstract window toolkit)
- AWT contains large numbers of classes and methods that allows you to create and manage graphical user interface(GUI) such as windows, buttons, scrollbars,textblocks ,etc.
- The awt was designed to provide a common set of tools for GUI design that could work on a variety of platforms.  
- The tools provided by the awt are implemented using each platforms native GUI toolkit, hence preserving the look and feel of each platform. It is an advantage of awt. But the disadvantage of such an approach is that GUI designed on one platform may look different when displayed on another platform. 
- Awt is the foundation upon which swing is made. 

## AWT Hierarchy
![Awt Hierarchy](https://beginnersbook.com/wp-content/uploads/2015/06/awt_hierarchy.png)  

### Component
- The component is an abstract class that encapsulates all the attributes of a visual Components. 
- Except for menus, all user interface elements that are displayed on the screen and that interact with the user of subclasses of Component. 
- A Component object is responsible for remembering the current foreground and background colors and the currently selected text font. 
 
### Container   
- The Container class is a subclass of Component class.
- It has additional methods that allow other Component objects to be nested within it. 
- Other Container objects can be stored inside a Container(Since they are themselves an instance of Component).   
- This makes for a multilevel containment system.  
- A Container is responsible for laying out i.e. positioning any components that it contains. It does thus throw the use of various layout manager. 
 
### Panel  
- The panel is the Container that does not contain a title bar, menu bars, border. 
- It can have other components like button text field, etc. The panel is the superclass for the applet. 
- This is why you don't see title bar, menu bar or border when an applet is run inside a browser. When you run an applet using an applet viewer, the applet viewer provides the title and border. 
- Other components can be added to a Panel objects by its add() method. Once this components have been added, you can position and resize them manually using the setLocation(), setSize(), setBounds(), etc.  
 
### Window  
- The Window is the Container that has no borders and menu bars. 
- The Window class creates a top level window. 
- A top level window is not contained within any other object. Generally, you won't create a Window object directly. Instead, you will use a subclass of Window called Frame.  
 
### Frame  
- The frame has a title bar, menu bar, borders and resizing corners.  
- The precise look of a frame will differ from the environment.
-  The frame is a Container that contains several different components like button, title, text field, label etc.
-  In Java, most of the awt application is created using the frame window. 