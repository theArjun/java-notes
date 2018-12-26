class BoxDemo{
    public static void main(String[] args){
        Box myBox = new Box();
        double volume;

        myBox.width = 10;
        myBox.height = 20;
        myBox.length = 30;
        
        volume = myBox.width*myBox.height*myBox.length;
        System.out.println("Volume = "+volume);
    }
}