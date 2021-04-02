// TOHDemo refers to Tower Of Hanoi Demo.
class TOHDemo{
    public static void main(String[] args){
        // This accepts the no of disks
        int noOfDisks = 4;
        TOH objectOne = new TOH();
        // Passing the no of disks and rod names to recursive function.
        objectOne.tower(noOfDisks,"Source Rod","Destination Rod","Auxilary Rod");
    }
}