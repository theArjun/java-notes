// TOH refers to Tower Of Hanoi.
public class TOH{
    // Defining a method which accepts parameters as: no of disks, name of rods (should match according to name of formal arguments passed).
    public void tower(int noOfDisks, String sourceRod, String destinationRod, String auxiliaryRod){
        if(noOfDisks == 1){
            System.out.format("\nRod %d moved from %s to %s",1,sourceRod,destinationRod);
            return ;
        }else{
            // Key Algorithms :
            tower(noOfDisks - 1, "Source Rod","Auxiliary Rod","Destination Rod");
            System.out.format("\nDisk %d moved from %s to %s",noOfDisks,sourceRod,destinationRod);
            tower(noOfDisks - 1, "Auxiliary Rod","Destination Rod","Source Rod");
        }        
    }

}