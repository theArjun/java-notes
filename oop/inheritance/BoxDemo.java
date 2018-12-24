class BoxDemo{
    public static void main(String[] args){
        BoxWeight boxWeightOne  = new BoxWeight(10,20,15,32);
        BoxWeight boxWeightTwo =  new BoxWeight(2,3,4,5);

        double volume;
        volume = boxWeightOne.volume();
        System.out.println("Volume of Box Weight One is "+ volume);
        System.out.println("Weight of Box Weight One is "+ boxWeightOne.weight);
        volume = boxWeightTwo.volume();
        System.out.println("Volume of Box Weight Two is "+ volume);
        System.out.println("Weight of Box Weight Two is "+ boxWeightTwo.weight);
    }
}