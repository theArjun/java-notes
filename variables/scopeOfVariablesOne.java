class Scope{
    public static void main(String[] args){
        if(true){
            int i = 1;
        }else{
            System.out.println(i); //error: cannot find symbol
        }
    }
}