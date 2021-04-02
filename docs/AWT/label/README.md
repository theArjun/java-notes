# Labels
- Labels are passive controls that do not support any interaction with the user i.e. no event handling.
- A label is an object of type ```Label``` and it contains a String, which it displays.
- Label defines the following constructors:  
i. ```Label() throws HeadLessException```  
ii. ```Label(String str) throws HeadLessException``` // The string is left justified.  
iii. ```Label(String str, int how) throws HeadLessException``` // label.LEFT, label.RIGHT  

### 👉Methods
i. ```void setText(String str);```  
ii. ```String getText();```  
iii. ```void setAlignment(int how);```  
iv. ```int getAlignment();``` 

### Example 

        Label name = new Label("Arjun");
        name.setText("Another Arjun");
        String myNameWas = name.getText();

