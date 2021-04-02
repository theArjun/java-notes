class A{
    void display(){
        System.out.println("This is from class A");
    }
}
class B extends A{
    void display(){
        System.out.println("This is from class B");
    }
}

class Demo{
    public static void main(String[] args){
        A aObject = new A();
        B bObject = new B();

        aObject.display();
        bObject.display();
        // bObject.super.display();
    }
}