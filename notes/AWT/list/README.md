# List 
 - The ``` List```  class provides a compact, multiple-choice scrolling selection list.

 ## Constructors
  1. ``` List() throws HeadlessException``` 
  2. ``` List(int numRows) throws HeadlessException``` 
  3. ``` List( int numRows, boolean multipleSelect) throws HeadlessException``` 
>numRows number of rows will be visible, if false, then only one item may be selected.

 ## Methods
  1. ``` void add(String name);``` 
  2. ``` void add(String name , int index);``` 
  3. ``` String getSelectedItem()```
  -  for single selection
  5. ``` int getSelectedIndex()``` 
  6. ``` String[] getSelectedItems()```  
  - for multiple selection
  8. ``` int[] getSelectedIndexes()``` 
  9. ``` int getItemCount();``` 
  10. ``` void select(int index);``` 
  
