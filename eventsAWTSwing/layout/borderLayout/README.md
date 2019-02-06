# Border Layout

- The BorderLayout manager arranges components within specified regions of container.
- Valid regions are : "North", "South", "East", "West" & "Center".

## Constructor

- ```BorderLayout()```
- ```BorderLayout(int hgap, int vgap)```  
    Eg:  ```add(new Button("North"), BorderLayout.WEST)```
         ```add("North", new Button("West") )```