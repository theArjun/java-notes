// To get access to Nested Interface : we write OuterClassName.NestedClasName
class Dog implements Animal.Activity{
    public void move(){
        System.out.println("Dog is moving.");
    }
}