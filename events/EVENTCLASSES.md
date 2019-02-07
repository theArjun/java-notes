# Event Classes

![Event Classes](https://i.ibb.co/4jK8m8c/event-Classes.jpg)

## Action Event Class

- An Action Event is generated when:
  - a button is pressed.
  - a list item is double clicked.
  - menu item is clicked.
  
### Constructor

- ```ActionEvent(Object src, int type, String cmd)```
- ```ActionEvent(Object src, int type, String cmd, int modifiers)```
- ```ActionEvent(Object src, int type, String cmd, long when, int modifiers)```

Here,   
```src```  = reference to the object that generated this event.  
```type``` = Determine type of event  
```cmd``` = command string  
```modifier``` = indicates modifier keys (```ALT, CTRL, SHIFT```); values are ```ALT_MASK, CTRL_MASK, SHIFT_MASK```  
```when``` = specifies when the event occured

  - You can obtain the command name for the envoking ActionEvent object by using:
        ```String getActionCommand()```

For eg:  
- When a button is pressed, an action event is generated that has a command name equal to the label on that button.
- Other Methods :

    ```int getModifier()```  
    ```long getWhen()```

## KeyEvent Class
- It is generated when:
    - Keyboard input occurs

### Types of KeyEvent
1. ```KEY_PRESSED``` - generated when key is pressed.
2. ```KEY_RELEASED``` - generated when key is released.
3. ```KEY_TYPED``` - generated when key is generated.

### Constants

```VK_ALT```,
```VK_DOWN```,
```VK_LEFT```,
```VK_RIGHT```,
```VK_ENTER```,
```VK_ESCAPE```,
```VK_CONTROL```,
```VK_SHIFT```,

### Methods

- ```char getKeyChar ()```;
- ```int getKeyChar ()```;

## Mouse Event

- There are eight types of mouse events:
- Eight integer constants are defined to determine types:  

| MOUSE EVENT | Generate |  
------------|-------------  
| ```MOUSE_CLICKED``` | When user clicked the mouse |
| ```MOUSE_DRESSED``` | The user dragged the mouse |
| ```MOUSE_ENTERED``` | The mouse entered a component |
| ```MOUSE_EXITED``` | The mouse exited from a component |
| ```MOUSE_MOVED``` | The mouse moved |
| ```MOUSE_PRESSED``` | The mouse was pressed |
| ```MOUSE_RELEASED``` | The mouse was released |
| ```MOUSE_WHEEL``` | The mouse wheel was moved. |

### Methods:

- ```int getX()```
- ```int getY()```
- ```Point getPoint()``` -> gives object that contain X, Y co-ordinates
- ```int getClickCount()```
- ```boolean isPopupTrigger()``` -> tests if this events causes a pop-up menu to appear on this platform.
- ```int getButton()``` -> returns a values that represents the button that caused the event.

## Summary

| Event Class | Description |  
------------|-------------  
| 1. Action Event | Generated whe a button is pressed, a list item s double-clicked or menu item is selected. |
| 2. Key Event | Generated when input is received from the keyboard |
| 3. Mouse Event | Generated when the mouse is dragged, moved, clicked, pressed, or released, enter or exist component. |
| 4. Adjustment Event | Generated when a scroll bar is manipulated. |
| 5. Component Event | Generated when a component is hidden, move, resized or becomes visible. |
| 6. Container Event | Generated when a component is added to or remoevd from a component. |
| 7. Focus Event | Generated when a component is gains or loses keyboard focus. |
| 8. Input Event | Abstract superclass for all component input event classes. |
| 9. Item Event | Generated when a checkbox or list item is clicked: also occurs when a choice selection is made or a checkable menu item is selected or deselected. |
| 10. MouseWheelEvent | Generated when the mouse wheel is moved. |
| 11. TextEvent | Generated when the value of a text area or text field is changed. |
| 11. WindowEvent | Generated when a window is activated, closed, deactivated, opened or quitted. |


