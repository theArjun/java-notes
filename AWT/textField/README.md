# TextField
  The ```TextField``` class implements a single line text entry area ususally called an edit control.

  ```TextField``` allow the user to enter strings and to edit the text using the arrow keys, cut and paste keys and mouse selection.

 ## Constructors 
  1. ```public TextField(String initialText, int columns)```
  - Construct a TextField instance with the given initial text string with the number of column

  2. ```public TextField(String strText);```
  - Set the text display text on this TextField instance

  3. ```public TextField(int columns);```
  - Construct s TextField instance with number of columns
 
 ## Public Methods
  1. ```boolean isEditable()```
  
  2. ```public String getText();```
  - Get the current text on this TextField instance
  
  3. ```public void setText(String strText)```
  - Set this display text on this TextField instance

  4. ```public void setEditable(boolean editable);```
  - Set the TextField to editable (read/ write) or non editable (read- only)
 
  5. ```void setEchoChar(char ch)```
  - Change the content of generally password into   
    OR  
   there may be times when you will want the user to enter text that is not displayed, such as a password. You can disable the echoing of the characters as they are typed by calling this method.
  - If ch is 0, then normal echoing is restored.  
   ```TextField password = new TextField();```  
   ```password.setEchoChar("*")```
  
  6. ```boolean echoCharIsSet();```
  -  Return ture or false whether the TextField is set with some char
  
  7. ```char getEchoChar();```
  - Return the character which was set in the TextField.

