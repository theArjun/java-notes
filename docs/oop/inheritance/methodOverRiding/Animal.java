class Animal{
    public void eat(){
        System.out.println("Animal eats grass.");
    }    
}
class Human extends Animal{
    public void eat(){
        // System.out.println("Human eats rice.");
        super.eat(); // vitra kehi lekhna paidaina
    }
}
class Inherit{
    public static void main(String[] args){
        Animal animalObject  = new Animal();
        Human humanObject = new Human();

        animalObject.eat();
        humanObject.eat();
    }
}