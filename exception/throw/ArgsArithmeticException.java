class ArgsException{
    public static void main(String[] args){
        try{
            int lengthOfArgs = args.length;
            if(lengthOfArgs < 2){
                throw new ArithmeticException("Args is less than two.");
            }else if(lengthOfArgs > 2){
                throw new ArrayIndexOutOfBoundsException("More than Two args.");
            }
            System.out.println("Two arguments.");
        }catch(ArithmeticException errorMessage){
            System.out.println("Error Message : "+errorMessage.getMessage());
        }catch(ArrayIndexOutOfBoundsException errorMessage){
            System.out.println("Error Message : "+errorMessage.getMessage());
        }
        System.out.println("The program ended successfully.");
    }
}