# Adapter Class

- Java compiles a special feature, called an adapter class, that can simplify he creation of event handlers in certain situations.
- An adapter class prvovides an empty implementation of all methods in an ```EventListener ``` interface.
- It is useful when you want to receive and process only some of the events that are handled by a particular event listener interface .

Commonly used ```Listener``` Interface implemented by Adapter Class :


| Adapter Class | Listener Interface |
| --------------|------------------- |
| ```ComponentAdapter``` | ```ComponentListener``` |
| ```ContainerAdapter``` | ```ContainerListener``` |
| ```FocusAdapter``` | ```FocusListener``` |
| ```KeyAdapter``` |``` KeyListener``` |
| ```MouseMotionAdapter``` | ```MouseMotionListener, MouseListener & MouseWheelListener``` |
| ```WindowAdapter``` | ```WindowListener, WindowFocusListener & WindowStateListener``` |

