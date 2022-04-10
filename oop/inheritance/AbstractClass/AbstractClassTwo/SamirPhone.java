// Samir was also unable to extend dancing feature, so this class becomes abstract.
abstract class SamirPhone extends ArjunPhone{
    // Later, Samir decides to extend the feature proposed by Arjun.
    public void move(){
        System.out.println("Moving...");
    }
    // Samir was also unable to implement the dancing feature.
    // As any class inherited from abstract class fails to implement all the abstract methods, the class also becomes abstract and can't instantiate any method.

}