// Since the methods are abstract, the class is also abstract.
abstract class ArjunPhone{
    // Implemented calling feature.
    public void call(){
        System.out.println("Calling ...");
    }
    // Planning to develop dancing, moving feature.
    // As body can't be implemented the abstract keyword is used before function definition.
    abstract public void dance();
    abstract public void move();
}