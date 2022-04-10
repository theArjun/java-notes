class Sample{
    final int h;
    Sample(){
        h = 8;
    }
}

class Final{
    public static void main(String[] args){
        Sample sampleObject = new Sample();
        System.out.println("H = "+sampleObject.h);
    }
}