abstract class Animal{ // Define a abstract class.
    abstract void eat(); // Define a abstract method.
}

class Cat extends Animal{
    void eat(){ // Override it.
        System.out.println("Cat is eating.");
    }
}

class Cow extends Animal{
    void eat(){ // Override it.
        System.out.println("Animal is eating.");
    }
}

class Five{
    public static void main(String[] args){
        Animal referrer = new Cat(); // Create referrer object of Parent abstract class.
        referrer.eat();
        referrer = new Cow();
        referrer.eat();
    }
}