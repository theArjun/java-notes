import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Input extends Frame{
	
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String JDB_URL = "jdbc:mysql://localhost:3306/gces";
	
	String insertQuery;
	
	String name = "", address = "";
	double salary;
	
	Label nameLabel, messageLabel, addressLabel, salaryLabel;
	Button clearButton, submitButton;
	TextField nameField, addressField, salaryField;
	
	Input(String title) throws NullPointerException{
		super(title);
		
		setSize(300,300);
		setLayout(new FlowLayout());
		setVisible(true);
		
		messageLabel = new Label("Enter your details here : ");
		
		clearButton = new Button("Clear");
		submitButton = new Button("Submit");
		
		nameField = new TextField("Name", 30);
		addressField = new TextField("Address", 30);
		salaryField = new TextField("Salary", 30);
				
		add(messageLabel);
		add(nameField);
		add(addressField);
		add(salaryField);
		
		add(clearButton);
		add(submitButton);
		
		/* When label gains focus, field should me empty. */
		nameField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent fe) {
				nameField.setText("");
			}
			
			public void focusLost(FocusEvent fe) {
				if(nameField.getText().equals("")) {
					nameField.setText("Name");
				}
			}
		});
		
		addressField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent fe) {
				addressField.setText("");
			}
			
			public void focusLost(FocusEvent fe) {
				if(addressField.getText().equals("")) {
					addressField.setText("Address");
				}
			}
		});
		
		salaryField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent fe) {
				salaryField.setText("");
			}
			
			public void focusLost(FocusEvent fe) {
				if(salaryField.getText().equals("")) {
					salaryField.setText("Salary");
				}
			}
		});
		

		/* When user clicks Clear Button, field should be reset. */
		clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				nameField.setText("Name");
				addressField.setText("Address");
				salaryField.setText("Salary");
			}
		});		
		
		/* Closable Frame */
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		/* When user clicks Submit Button */
		submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				/* When user inputs something */
				if(!(nameField.getText().equals("Name") && addressField.getText().equals("Address") && salaryField.getText().equals("Salary"))) {
			
					try {
						/* Insert Query using Prepared Statement */
						insertQuery = "INSERT INTO `employees` ( `username`, `address`, `salary`)" + " VALUES (?, ?, ?)";
						
						/* Selecting the JDBC Driver */
						Class.forName(JDBC_DRIVER);
						/* Creating the connecting */
						Connection conn = DriverManager.getConnection(JDB_URL,"root","");
						/* Creating Prepared Statement */
						PreparedStatement pst = conn.prepareStatement(insertQuery);
						/* Adding the values */
						pst.setString(1,nameField.getText());
						pst.setString(2, addressField.getText());
						pst.setDouble(3, Double.parseDouble(salaryField.getText()));
						/* Executing the query, precompiled. */
						pst.executeUpdate();
						/* Closing the Statement */
						pst.close();		
					}
					catch(SQLException exc) {
						exc.printStackTrace();
					}
					catch(ClassNotFoundException exc) {
						exc.printStackTrace();
					}
					
				}
			}
		});	
	}
	
	public static void main(String[] args) {
		new Input("Data Export to Database");
	}
}


