# Graphics Context and Graphics Object

- A graphics context enables drawing on the screen.
- A ```Graphics``` object manages a graphics context and draws pixels pn the screen that represent text and other graphical objects (lines, ellipses, rectangles and polygons.)
- ```Graphics``` object contain methods for drawing, font manipulation, color manipulation.
  
## Methods that takes ```Graphics``` object as an argument

1. ```public void paint(Graphics g)```
- The ```paint()``` method of the ```Component``` class takes a ```Graphics``` object as a argument.
- This object is passed to the paint method by the system when a ```paint()``` method by the system when a paint operation is required for a component.
- The ```paint()``` method defined in class ```Component``` does nothing by default, it must be overridden by the programmer.
- The ```paint()``` method is rarely called directly by the programmer.
- When an applet executes, the ```paint()``` method is automatically caused. Similarly, when any component is displayed, that component's paint method is called automatically. 

    A. ```public void repaint()```
- If the progammer needs to call ```paint()```, a call is made to the ```Component``` class ```repaint()``` method.
- The paint method request a call to the ```Component```'s update method.

2. ```public void update()```
- In AWT GUI Components, the ```update()``` clears the background of GUI components.

3. ```public void paintComponent(Graphics g)```
- Swing components the inherit from the class ```JComponent``` contain method ```paintComponent()``` that helps them to draw properly in the context of a swing GUI.

