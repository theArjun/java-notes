class BoxDemoTwo{
    public static void main(String[] args){
        Box myBox;
        myBox = new Box(); // This will invoke the default constructor made by JVM. 

        myBox.width = 10;
        myBox.height = 20;
        myBox.length = 30;
        
        double volume = myBox.width*myBox.height*myBox.length;
        System.out.println("Volume = "+volume);
    }
}