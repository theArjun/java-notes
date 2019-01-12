class AbstractDemo{
    public static void main(String[] args){
        ArjunPhone arjunVariable; // ArjunPhone is abstract. So, no object can't be instantiated from the class; though variable can be created.
        // Same applies for SamirPhone

        // But, Suman Phone is concrete class, so it can instantiate object.
        SumanPhone sumanObject = new SumanPhone();
        System.out.println("\nThis is from Suman Object : ");
        sumanObject.call();
        sumanObject.dance();
        sumanObject.move();

        // Using Dynamic Method Dispatch, we can assign the variable of abstract super class to the object of concrete sub class.
        arjunVariable = new SumanPhone();
        System.out.println("\nThis is from Arjun Variable : ");
        arjunVariable.call();
        arjunVariable.dance();
        arjunVariable.move();
    }
}