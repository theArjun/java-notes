class Animal{
    // Creating the interface inside class; nested interface.
    interface Activity{
        public default void move(){
            System.out.println("Animal is moving.");
        }
    }
}