class Array{
    public static void main(String args[]){
        int days[];
        days = new int[12];
        for(int i = 0; i<12;i++){
            days[i] = i;
        }
        for(int i = 0; i<12;i++){
            System.out.println("Day : "+days[i]);
        }
        System.out.println(days.getClass().getName());
    }
}