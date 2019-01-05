import javax.swing.JOptionPane;

class Sum{
    public static void main(String[] args){
        int firstNo = Integer.parseInt(JOptionPane.showInputDialog("Enter first number :"));
        int secondNo = Integer.parseInt(JOptionPane.showInputDialog("Enter second number :"));
        int sum = firstNo + secondNo;
        JOptionPane.showMessageDialog(null,"The sum is "+sum, "Arjun's Calculator", JOptionPane.PLAIN_MESSAGE);
    }
}