// Can static and private function be overrided ?

class Animal {
    static void eat() {
        System.out.println("Eating.");
    }

    private void move() {
        System.out.println("Moving.");
    }
}

class Human extends Animal {
    void eat() { // error: eat() in Human cannot override eat() in Animal; overridden method is static.
        System.out.println("Human Eating.");
    }

    void move() { // move() method is not inherited from Animal class, so for Human, it's not inherited and doesn't seem like overriding.
        System.out.println("Human Moving.");
    }
}

class Override {
    public static void main(String[] args) {
        Human h = new Human();
        Animal a = new Animal();

        h.move();
        h.eat();
    }
}