# Checkbox
 - A ```Checkbox``` is a control that is used to turn an option on or off.
 - It consists of a small box tha can either contain a checkmark or not.
 - There is a ```Label``` associated with each check box that describes what option the box represents.
 - Can change the state of a ```Checkbox``` by clicking on it.

 ## Constructors:
  1. ```Checkbox() throws HeadlessException```
  2. ```Checkbox(String str) throws HeadlessException```
  3. ```Checkbox(String str, boolean on) throws HeadlessException```
  4. ```Checkbox(String str, boolean on, CheckboxGroup cbGroup) throws HeadlessException```
  5. ```Checkbox(String str, CheckboxGroup cbGroup, boolean on) throws HeadlessException```


 ## Methods 
  1. ```boolean getState();```
  2. ```void setState(boolean on);```
  3. ```String getLabel();```
  4. ```void setLabel(String str);```


