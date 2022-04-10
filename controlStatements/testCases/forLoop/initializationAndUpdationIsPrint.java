class ForLoop{
    public static void main(String[] args){
        // int i = 0; // This statement cures the bug which wasn't discussed in class : cannot find symbol.
        for(System.out.println("Hello World") ; i < 3 ; System.out.println("Hello Venus")){ // Hello World gets printed once and Hello Venus gets printed thrice.
            i++;
        }
    }
}