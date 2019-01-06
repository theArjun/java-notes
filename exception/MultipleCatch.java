class MultipleCatch{
    public static void main(String[] args){
        try{
            int lengthOfString = args.length;
            System.out.println("Length of string : "+lengthOfString);
            int numberOne = 42 / lengthOfString; // This will throw error if length of String is zero; ArithmeticException
            // How to execute other run-time exceptions at once ?
            // -> Try implementing one run-time exception at once.
            int sampleArray[] = {1};
            sampleArray[23] = 46; // This should throw error; ArrayIndexOutOfBoundsException
            String stringObject = null; // Initializing String variable with null value ; NullPointerException
            if (stringObject.equals("Arjun")){ 
                System.out.print("Wow! That's my name."); 
            }else{
                System.out.println("I expected my name.");
            }
        }
        catch(ArithmeticException error){
            System.out.println("Divide by zero. Try changing value lengthOfString.");
        }        
        catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Array Index reached more than allocated. Try allocating the number within the bound.");
        }
        catch(NullPointerException error){
            System.out.println("String is pointed to null. Try allocating it first.");
        }
        // catch(Exception error){
        //     System.out.println("I am noob here to explain. Try consulting with respected Nishal Guru.");
        // }
        System.out.println("These are statements after try catch.");
    }
}