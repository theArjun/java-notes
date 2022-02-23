class TypeConversion{
    public static void main(String args[]){
        int x;
        short z=30;
        double y=20.5;
        /* This is how implicit type conversion takes place. */
        x=z;
        System.out.println("Value of float Z : "+z+" is converted to int X : "+x);

        /* This is how explicit type conversion takes place. */
        x=(short) y;
        System.out.println("Value of float Y : "+y+" is converted to int X : "+x);

    }
}
