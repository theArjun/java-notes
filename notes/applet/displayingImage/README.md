# Displying Image in Applet

 Java will allow the applet to load the data holding the HTML file that started the applet (theDocumentBase) and the directory from which class file was loaded (codeBase). Both documentBase and codeBase return directories as URL object respectively.


## Code
- We've assumed there is an image named `blue.jpg`.
```java
{% include 'applet/displayingImage/DisplayImage.java' %}
```
