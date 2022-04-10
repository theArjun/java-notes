class Swap{
    int x;
    int y;
    // Sets values to the properties    
    Swap(int val1, int val2){
        x=val1;
        y=val2;
    }
    public void printValues(){
        System.out.println("X : "+x);
        System.out.println("Y : "+y);
    }
    /* Swaps the values without
     third variable */
    public void swapValues(){
        x=x+y;
        y=x-y;
        x=x-y;
    }
}
class SwapWithoutThirdVariable{
    public static void main(String[] args){
        Swap exampleOne = new Swap(3,4);
        exampleOne.printValues();
        exampleOne.swapValues();
        exampleOne.printValues();
    }
}
