class NestedTry{
    public static void main(String[] args){ // Command Line Arguments
        System.out.println("Args : "+args[0]);
        // try{
        //     int a  = args.length;
        //     int b = 42 / a;
        //     System.out.println("A = "+a);
        //     try{ // Nested Try Block
        //         if(a==1){
        //             a = a/(a-a);
        //         }
        //     }catch(ArrayIndexOutOfBoundsException e){
        //         System.out.println("Array index out of bounds : "+e);
        //     }
        // }catch(ArithmeticException e){
        //     System.out.println("Divide by zero."+e);
        // }
        try{
            args[2] = "Hari";
            // System.out.println(args[4]);
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Error : "+error);
        }
    }
}