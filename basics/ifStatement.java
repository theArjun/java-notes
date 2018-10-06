// This is If Statement.

class IfStatement{
    public static void main(String args[]){
        int x,y;
        x=100;
        y=20;

        if(x!=y) System.out.println("X isn't less than y.");
        y*=5;
        if(x==y) System.out.println("X is equal to y.");
        y+=10;
        if(x<y) System.out.println("X is now less than y.");

        // this won't see anything
        if(x==y) System.out.println("You mayn't see this.");
    }
}