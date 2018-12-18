class Animal{
    int numberOfLegs;
    String color;

    Animal(){
        numberOfLegs = 4;
        color = "Unspecified";
    }

    Animal(int legs, String col){
        numberOfLegs = legs;
        color = col;
    }

    // void eat(String)

    void display(){
        System.out.println("Legs  = "+this.numberOfLegs); // This refers to this object.
        System.out.println("Color  = "+ this.color);
    }
}