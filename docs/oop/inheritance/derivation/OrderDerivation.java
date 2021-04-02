class A{
    A(){
        System.out.println("Inside A"); // This gets envoked first.
    }
}

class B extends A{
    B(){
        System.out.println("Inside B"); // This gets envoked after superclass.
    }
}

class C extends B{
    C(){
        System.out.println("Inside C"); // This gets envoked at last.
    }
}

class OrderDerivation{
    public static void main(String[] args){
        C cObject = new C();
    }
}