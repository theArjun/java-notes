import javax.swing.JOptionPane;

class Sum{
    public static void main(String[] args){
        // showInputDialog is method to input the string data,
        // thus it is converted into Integer.
        int firstNo = Integer.parseInt(JOptionPane.showInputDialog("Enter first number :")); 
        int secondNo = Integer.parseInt(JOptionPane.showInputDialog("Enter second number :"));
        int sum = firstNo + secondNo;
        // Accepts 4 parameters; First -> where to position it, Second -> What to print,
        // Third -> Title Bar, Fourth -> Icon/Message to be placed.
        JOptionPane.showMessageDialog(null,"The sum is "+sum, "Arjun's Calculator", JOptionPane.PLAIN_MESSAGE); 
    }
}