import java.awt.*;

public class TextAreaDemo extends Frame {
    static int START_INDEX = 0;
    static int END_INDEX = 23;

    TextArea hobbies, trophies, description;
    TextAreaDemo(String title) {
        super(title);
        setSize(400, 400);
        setVisible(true);
        setLayout(new GridLayout(3,1));

        hobbies = new TextArea("Write your hobbies here",2,10,TextArea.SCROLLBARS_VERTICAL_ONLY);
        trophies = new TextArea("Write your trophies here",2,10,TextArea.SCROLLBARS_NONE);
        description = new TextArea("Write your description here",2,10,TextArea.SCROLLBARS_BOTH);
        
        add(hobbies);
        add(trophies);
        add(description);

        System.out.println("Text In Trophies Section : "+trophies.getText());
        trophies.setText("Write your certifications here");
        System.out.println("Is Trophies Editable : "+trophies.isEditable());
        trophies.setEditable(false);
        System.out.println("Is Trophies Editable : "+trophies.isEditable());

        hobbies.append("! Leave it if you have none.");
        description.insert("! Leave it if you have none.",START_INDEX);

        hobbies.replaceRange("Just Got Replaced !", START_INDEX, END_INDEX);
        
    }

    public static void main(String[] args) {
        TextAreaDemo obj = new TextAreaDemo("Text Area Demo");
    }
}
