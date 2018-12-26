class BoxDemo{
    public static void main(String[] args){
        Box myBox = new Box();
        // Box myBoxOne;
        // myBoxOne = new Box(); // We can declare and assign the objects this way, too.
        double volume;

        myBox.width = 10;
        myBox.height = 20;
        myBox.length = 30;
        
        volume = myBox.width*myBox.height*myBox.length;
        System.out.println("Volume = "+volume);
    }
}