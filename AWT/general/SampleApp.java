import java.awt.*;

public class SampleApp extends Frame {
    SampleApp(String title){
        super(title);

        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);

        /* Label */
        Label name, password, email, degree, gender, programmingLanguages, career, description;

        name = new Label("Name");
        password = new Label("Password");
        email = new Label("Email");
        gender = new Label("Gender");
        degree = new Label("Degree");
        programmingLanguages = new Label("Programming Languages");
        career = new Label("Career");
        description = new Label("Description");

        /* TextField */
        TextField nameEntry, passwordEntry, emailEntry;

        nameEntry = new TextField(50);
        passwordEntry = new TextField(50);
        emailEntry = new TextField(50);

        /* CheckboxGroup - Radio Buttons */
        CheckboxGroup chooseGender  = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", chooseGender, true);
        Checkbox female = new Checkbox("Female", chooseGender, false);

        /* Checkbox */
        Checkbox c, cpp, java, python, javascript;

        c = new Checkbox("C");
        cpp = new Checkbox("C++");
        java = new Checkbox("Java");
        python = new Checkbox("Python");
        javascript = new Checkbox("JavaScript");

        /* Choice - Drop Down */
        Choice chooseDegree = new Choice();
        chooseDegree.add("Undergraduate");
        chooseDegree.add("Graduate");
        chooseDegree.add("Praduate");

        /* Select by Scrolling - Multiselect Available*/
        List chooseCareer = new List(5, true);
        chooseCareer.add("System Architect Designer");
        chooseCareer.add("System Debugger");
        chooseCareer.add("GUI Developer");
        chooseCareer.add("System Integrator");

        TextArea descriptionField = new TextArea("",4,50,TextArea.SCROLLBARS_VERTICAL_ONLY);

        /* Button */
        Button submit = new Button("Submit");

        add(name);
        add(nameEntry);
        add(password);
        add(passwordEntry);
        add(email);
        add(emailEntry);
        add(gender);
        add(male);
        add(female);
        add(programmingLanguages);
        add(c);
        add(cpp);
        add(java);
        add(python);
        add(javascript);
        add(degree);
        add(chooseDegree);
        add(career);
        add(chooseCareer);
        add(description);
        add(descriptionField);
        add(submit);

    }

    public static void main(String[] args) {
        new SampleApp("Sample App");
    }
}