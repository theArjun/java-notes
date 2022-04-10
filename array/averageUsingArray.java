class Average{
    public static void main(String args[]){
        double marks[] = {40.6,30.5,90.3,20.8,87.5};
        double result=0;

        for(int i=0;i<5;i++){
            result +=marks[i];
        }
        System.out.println("Percentage = "+result/5);
    }
}