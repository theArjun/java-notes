class Literals{
    public static void main(String[] args){
        int decimalLiteral = 10;
        int octalLiteral = 00;
        int anotherOctalLiteral = 050;
        int hexaDecimalLiteral = 0x50;
        // int anotherHexaDecimalLiteral = 0x50.9; // This is error as int doesn't hold floating hexadecimal number. 

        boolean boolLiteral = true;
        char charLiteral = 0xface;
        float floatLiteral = 123.456f;
        double doubleLiteral = 123.456d;
        double anotherDoubleLiteral = 123.456;

        // int nextOctalLiteral = 0123.456; // This is error as int doesn't hold floating octal number.

        String name  = "Arjun";
        // System.out.println(Name); // Java Variables are case-sensitive , so name should be passed in order to print the name Arjun.

        // boolean anotherBoolLiteral = True; // This statement is wrong as boolean literals are lowercase.
        // if(anotherBoolLiteral){
        //     System.out.println("True worked.");
        // }

        // int x = 1; 
        // if(x){ // The parameter to be passed inside if statement is boolean literal, not integer value, so it throws error saying int cannot be converted to boolean.
        //     System.out.println("This gets printed if the if statement is true.");
        // }

        boolean y = true;
        while(y){
            System.out.println("This should surely execute.");
        }

        while(y){
            System.out.println("This gets printed if it is not unreachable statment."); // Javac didn't throw error regarding unreachable statment #issue::1
        }
    }
}

// Key Points to be remembered:
// Java Compiler checks whether the statement is unreachable or not.
// It doesn't assign value to variable in compile time.

// Another Life Lesson from Nishal Sir:
// The good coder is that who knows the core and excels in it.
// He also should co-up with libraries for meeting the industrial demand.