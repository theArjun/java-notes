class Animal {
    String color;
    int numberOfLegs;

    Animal() {
        System.out.println("This is Animal.");
    }

    Animal(String color, int numberOfLegs) {
        this.color = color;
        this.numberOfLegs = numberOfLegs;
        Human humanObject  = new Human(this.color,this.numberOfLegs);
    }

    void outerDisplay() {
        System.out.println("Animal Color : " + this.color);
        System.out.println("Animal Number of Legs : " + this.numberOfLegs);
    }

    class Human {
        String humanColor;
        int humanNumberOfLegs;
        Human(String humanColor,int humanNumberOfLegs){
            this.humanColor = humanColor;
            this.humanNumberOfLegs = humanNumberOfLegs;
            this.display();
        }
        public void display() {
            System.out.println("Human Color : " + humanColor);
            System.out.println("Human Number of Legs : " + humanNumberOfLegs);
            outerDisplay();
        }
    }
}
class Final {
    public static void main(String[] args) {
        Animal animalObject = new Animal("Red", 4);
    }
}