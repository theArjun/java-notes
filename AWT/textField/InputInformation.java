import java.awt.TextField;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.applet.Applet;

public class InputInformation extends Frame {

    TextField name, password, email;

    InputInformation(String title) {
        super(title);
        setSize(400, 400);
        setLayout(new FlowLayout());
        name = new TextField("Enter Name", 10);
        password = new TextField("Enter Password", 10);
        email = new TextField("Enter Email", 10);
        add(name);
        add(password);
        add(email);
        setVisible(true);
        password.setEchoChar('*'); 

        System.out.println("Password is Editable : "+password.isEditable());
        password.setEditable(false);
        System.out.println("Password is Editable : "+password.isEditable());
        System.out.println("EchoChar is set : "+password.echoCharIsSet());
        System.out.println("Characters inside Password : "+password.getText());

        name.setText("Please Enter Your Name");
    }

    public static void main(String[] args) {
        InputInformation obj = new InputInformation("Input Information");
    }
}