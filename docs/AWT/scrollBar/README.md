# Scrollbar
  - ```Scrollbar``` is used to select continuous values between a specified minimum and maximum.
  - May be oriented horizontally or vertically.
  - It contain slider box that can be dragged by the uset to a new position.

  # Constructors
   1. ```Scrollbar() throws HeadlessException```
   2. ```Scrollbar(int style) throws HeadlessException```  
- Style includes ```Scrollbar.VERTICAL``` and ```Scrollbar.HORIZONTAL```. 

3. ```Scrollbar(int style, int thumbSize, int min, int max) throws HeadlessException```

  # Methods:
   1. ```void setValues(int initialValue, int thumbSize, int min, int max);```
   2. ```int getValue()```
   3. ```void setValue(int newValue)```
   4. ```int getMinimum()```
   5. ```int getMaximum()```





