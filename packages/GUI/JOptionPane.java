import javax.swing.JOptionPane; // Importing the GUI Class

class Sum{
    public static void main(String[] args){
        int firstNo = Integer.parseInt(JOptionPane.showInputDialog("Enter first number :")); // showInputDialog is method to input the string data, thus it is converted into Integer
        int secondNo = Integer.parseInt(JOptionPane.showInputDialog("Enter second number :"));
        int sum = firstNo + secondNo;
        JOptionPane.showMessageDialog(null,"The sum is "+sum, "Arjun's Calculator", JOptionPane.PLAIN_MESSAGE); // Accepts 4 parameters; First -> where to position it, Second -> What to print, Third -> Title Bar, Fourth -> Icon/Message to be placed.
    }
}