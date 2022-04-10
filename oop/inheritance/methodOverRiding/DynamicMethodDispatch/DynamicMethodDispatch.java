class A{
    void callMe(){
        System.out.println("Inside A");
    }
}

class B extends A{
    void callMe(){
        System.out.println("Inside B");
    }
}

class C extends A{
    void callMe(){
        System.out.println("Inside C");
    }
}

class Dispatch{
    public static void main(String[] args){
        A aObject = new A();
        B bObject = new B();
        C cObject = new C();

        A referrer; // reference of type A refers to A
        referrer = aObject;
        referrer.callMe();

        referrer = bObject;
        referrer.callMe();

        referrer = cObject;
        referrer.callMe();

        B anotherReferrer;
        // anotherReferrer = aObject; // This won't compile. Incompatible type
    }
}