class Scope{
    public static void main(String args[]){
        int x;
        x=10;
        if(x==10){
            int y = 20;
            System.out.println("The value of x : "+x+" and y : "+y);
            x=y*2;

        }
        // y=30; // Y is not known here.

        /* X is still here. */
        System.out.println("Value of x: "+x);
    }
}