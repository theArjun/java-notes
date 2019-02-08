import java.awt.*;

public class LabelDemoOne extends Frame {
    LabelDemoOne(String title) {
        super(title);
        Label name = new Label();
        Label address = new Label();
        Label phoneNumber = new Label();
        Label college = new Label();

        add(name);
        add(address);
        add(phoneNumber);
        add(college);

        name.setText("Arjun Adhikari");
        address.setText("LA, California, United States");
        phoneNumber.setText("+12345647753");
        college.setText("MIT");

        name.setAlignment(Label.LEFT);
        address.setAlignment(Label.CENTER);
        phoneNumber.setAlignment(Label.CENTER);
        college.setAlignment(Label.CENTER);

        System.out.println("Name : "+name.getText());
        System.out.println("Address : "+address.getText());
        System.out.println("Phone Number : "+phoneNumber.getText());
        System.out.println("College : "+college.getText());

        System.out.println("Name Alignment : "+name.getAlignment());
        System.out.println("Address Alignment : "+address.getAlignment());
        System.out.println("Phone Number Alignment : "+phoneNumber.getAlignment());
        System.out.println("College Alignement : "+college.getAlignment());
    }

    public static void main(String[] args) {
        LabelDemoOne label = new LabelDemoOne("Label Demo");
        label.setSize(300,300);
        label.setVisible(true);
    }
}