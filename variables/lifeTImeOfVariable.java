class LifeTime{
    public static void main(String args[]){
        int x;

        for(x=0;x<3;x++){
            int y=100;  /* Y is initialized every time the loop runs. */
            System.out.println("Value of Y is :"+y);
            y=-1;
            {
                /* I created a new scope here to show a compile-time error. */
                int y;
            }
            System.out.println("Value of Y now is :"+y);
        }
    }
}