import java.util.Scanner;
class StackDemo{
    public static void main(String[] args){
        Stack st = new Stack();
        int data, choice;

        while(true){
            Scanner in = new Scanner(System.in);c // Takes input from user. 
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Display Element");
            System.out.println("4. Exit Program");
            System.out.print("\nEnter your choice : ");

            switch(in.nextInt()){ // Accepts incase of integer input.
                case 1:
                    System.out.println("\nEnter value : ");
                    data = in.nextInt(); // Receives input from user.
                    st.push(data);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.display();
                    break;
                case 4:
                    System.exit(0); // Halts the program.
            }

        }
    }
}