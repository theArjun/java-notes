# Adding and Removing Controls ?

- To include a control in a window, you must add it to the window.
- To do this, you must crate an instance of the desired control and then add it to a Window by calling add (), which is defined by Container class.

### Syntax
```Component add (Component ComponentRef);```

## AWT Controls

- Once a component has been added it will be automatically visible whenever its parent window is displayed.

### To remove
- ```void remove(Component ComponentRef);```
- ```void removeAll();```