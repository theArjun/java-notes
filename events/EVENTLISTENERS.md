# Sources of Events
 - ```Button```, ```CheckBox```, ```Choice```, ```List```, ```Menu Item```, ```Scrollbar```, ```TextField```, ```TextArea```, ```Window```


> User -> Event source -> Generates Event Objects -> Pass to EventListener(Handler) -> Handle and Return back to Source

 ## Event Listener Interface

### **KeyListener Interface**
- Define 3 methods to recognize when a key is pressed, released or typed.

 **Methods**
1. ```void keyPressed(KeyEvent ke)```  
2. ```void keyReleased(KeyEvent ke)```  
3. ```void keyTyped(KeyEvent ke)```  

### **MouseListener** 

 - Defines 5 methods to recognize when the mouse is clicked, enters a component, exits component, is pressed, is released.

 **Methods**
1. ```void mouseClicked(MouseEvent me)```
2. ```void mouseEntered(MouseEvent me)```
3. ```void mouseExited(MouseEvent me)```
4. ```void mousePressed(MouseEvent me)```
5. ```void mouseReleased(MouseEvent me)```

### **ActionListener**
- Defines one method to receive actions events.

**Methods**  
``` void actionPerformed(ActionEvet ae)```

### **ComponentListener**
- Defines 4 methods to recognize when a component is hidden , moved , resized or shown.

 **Methods**
  1. ```void componentResized(ComponentEvent ce)```
  2. ```void componentMoved(ComponentEvent ce)```
  3. ```void componentShown(ComponentEvent ce)```
  4. ```void componentHidden(ComponentEvent ce)```

### **AdjustmentListener**
- Defines one methods to receive adjustment events.

**Methods**  
 1. ```void adjustmentValueChanged(AdjustmentEvent ae)```

### **ContainerListener**
- Defines 2 methods to recognize when a componenet is added to or removed from a container.

**Methods**
1. ```void containerAdded(ContainerEvent ce)```
2. ```void containerRemoved(ContainerEvent ce)```

###  **FocusListener**
- Defines 2 methods to recognize a component gain or loses keyboard focuses

**Methods**
1. ```void focusGained(FocusEvent fe)```
2. ```void focusLost(FocusEvent fe)```

### **ItemListener**:
- Defines 1 method to recognize when the state of an item changes

**Methods**  
1. ```void itemStateChange(ItemEvent ie)```

### **MouseMotionListener**   
-Defines 2 methods to recognize when mouse is dragged or moved.

**Methods**
 1. ```void mouseDraged(MouseEvent me)```
 2. ```void mouseMoved(MouseEvent me)```

###  **MouseWheelListener**  
-Defines 1 method to recognize when the mouse wheel is moved.

**Methods**  
1. ```void mouseWheelMoved(MouseWheelEvent mwe)```

###  **TextListener**
- Defines 1 method to recognize when a text value changes.

**Methods**  
  1. ```void textValueChanged(TextEvent te)```

### **WindowFocusListener**
- Defines 2 methods to recognize when a window gains ore loses input focus

**Methods**
1. ```void windowGainedFocus(WindowEvent we)```
2. ```void windowLostFocus(WindowEvent we)```

### **WindowListener**
- Defines 7 methods to recognize when a window is activated, closed, deactivated,iconified, deiconified, opened or quit. 

**Methods**
1. ```void windowActivated(WindowEvent we)```
2. ```void windowClosed(WindowEvent we)```
3. ```void windowClosing(WindowEvent we)```
4. ```void windowDeactivated(WindowEvent we)```
5. ```void windowIconified(WindowEvent we)```
6. ```void windowDeiconified(WindowEvent we)```
7. ```void windowOpened(WindowEvent we)```

