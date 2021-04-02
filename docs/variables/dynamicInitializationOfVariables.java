class DynamicInitialization{
    public static void main(Static args[]){
        double a = 3.0,b=4.0;
          
        // c is dynamically initialized. It means that it is initialized at the run time.

        double c = Math.sqrt(a*a+b*b);
        System.out.println("Hypotenuse is : "+c);
        
    }    
}