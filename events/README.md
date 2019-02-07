# Event Handling

> What is Event ?

- Change in the state of an object is known as event. i.e. event describes the change i state of  source.
- Events are generated as a result of **user interaction with GUI components**. But they can also be generated explicitly.
- For eg:  Clicking on a button, moving the mouse, entering character through keyboard.

> What is Event Listener ?

- A Listener is an object that is notified when an event occurs.
- a.k.a **Event Handler**. (also known as)
- Listener is responsible for generating response to an event.
- It has two major requirements:
    1. **First**, it must have been registered with one or more source to receive notifications about specific types of events.
    2. It must implement methods to receive and process these notifications.
   
> What is Event Source ?
- A source is an object that generates an event. This occurs when the internal state of the object chages in some way.
- Source may generate more than one tyoe of event.
- A source must register listeners in order for the listeners to recieve notifications about specific type of event.
- Each type of event has its own registration method. Here is the general form.   
  ```public void addTypeListener (TypeListener el)``` // el = event listener   
  For eg:  
```addKeyListener()```  
    Here Type is the name of the event and el is the reference to the event listener.
- When an event occurs, all registered listeners are notified and recieve a copy of event object. This is known as **multicasting the event**.
- Some sources may allow only one listener to register. When such an event occurs, the registered listener is notified. This is known as **unicasting the event**.
- A source must also provide method that allows a listener to unregister an interest in a specific type of event. The general form:
  ```public void removeTypeListener(TypeListener el)```