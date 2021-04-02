class Four {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int sum = sumArray(array);
        System.out.println("Sum : "+sum);
    }

    public static int sumArray(int[] array){
        int sum = 0;
        for(int num:array){
            sum += num;
        }
        return sum;
    }
}