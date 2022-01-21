class DecToBin{
    public static void main(String[] args){
        int dec = 35;
        int bin=0,rem=0;
        while(dec!=0){
            rem=dec%2;
            bin=(bin*10)+rem;
            dec=dec/2;
        }
        System.out.println("In Binary = "+bin);
    }
}