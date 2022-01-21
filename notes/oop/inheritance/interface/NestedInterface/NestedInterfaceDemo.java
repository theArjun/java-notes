class NestedInterfaceDemo{
    public static void main(String[] args){
        Dog dogObject = new Dog();
        dogObject.move();

        // This is how, we refer to subclass object from nested interface referrer variable.
        Animal.Activity nestedReferrerOne = new Dog();
        nestedReferrerOne.move();

        // To be questioned here; called Anonymous Class
        // Animal.Activity nestedReferrerTwo = new Animal.Activity() {};
    }
}