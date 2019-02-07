# TextArea
  > Sub class of ```TextComponent```

  - Sometimes a single line of text input is not enough for a given task. To handle this situation, the awt includes a simple multiline editor called ```TextArea```.

  ## Constructors
   1. ```TextArea() throws HeadlessException```
   2. ```TextArea(int numLines, int numChars) throws HeadlessException```
   3. ```TextArea(String str) throws HeadlessException```
   4. ```TextArea(Stirng str, int numLines, numChars) throws HeadlessException```
   5. ```TextArea(String str, int numLines,int numChars, int sBars) throws HeadlessException```

   > Here, numLines represents rows and numChars represents number of columns. sBars is Scroll Bar to use scrollbar in the TextArea.

   ```SCROLLBARS_BOTH, SCROLLBARS_NONE, SCROLLBARS_HORIZONTAL_ONLY, SCROLLBARS_VERTICAL_ONLY```

  Public Methods:
   1. ```String getText()```
   2. ```void setText()```
   3. ```String getSelectedText()```
   4. ```void select(int startIndex, int endIndex)```
   5. ```boolean isEditable()```
   6. ```void setEditable( boolean canEdit)```

>  These methods are defined by ```TextComponent```  
> ```TextComponent``` class is the superclass of ```TextField``` and ```TextArea```  
> So, both ```TextField ```and ```TextArea``` can use these methods.
   
   TextArea adds the following editing methods:
   1. ```void append(String str)```
   - The ```append()``` method appends the strings specified by str to the end of the current text.

   2. ```void insert(String str , int index)```
   - ```insert()``` method inserts the string passed in str at the specified index.

   3. ```void replaceRange(String sr, int startIndex , int endIndex)```
   - To replace text, ```replaceRange()``` replaces the characters from startIndex to endIndex-1, with the replacement text passed in str.

