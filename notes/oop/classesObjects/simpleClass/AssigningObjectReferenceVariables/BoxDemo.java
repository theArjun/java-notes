class BoxDemo{
    public static void main(String[] args){
        Box myBox = new Box();
        Box myBoxReferrer = myBox;

        // Explanation in README

        myBoxReferrer = null; // Here, myBox has been set to null, but myBoxReferrer still points to original object.    
    }
}