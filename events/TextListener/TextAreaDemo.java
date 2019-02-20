import java.awt.*; // Page No 386 
import java.awt.event.TextListener;
import java.awt.event.TextEvent;
import java.applet.Applet;

/* 
    <applet code = "TextAreaDemo" height = "300" width = "300"></applet>
*/


public class TextAreaDemo extends Applet implements TextListener {
    TextArea echoOne;
    TextArea echoTwo;

    public void init () { 
        echoOne = new TextArea(2,40);
        echoTwo = new TextArea(2,40);

        LayoutManager layout = new FlowLayout();
        setLayout(layout);
        echoOne.addTextListener(this);  // <= register gareko mathi TextListener implement nagareko vaye yeha aru class ko reference pathauna parthyo
        echoTwo.setEditable(false);
        
        add(echoOne);
        add(echoTwo);

        echoOne.setText("Enter text in this area and watch !!!");
    }
    
    public void textValueChanged (TextEvent e) {
        String entry = echoOne.getText();
        echoTwo.setText(entry);
    }
}