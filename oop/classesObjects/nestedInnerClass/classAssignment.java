class Outer{
    int outerX = 100;
    int outerY = 200;

    void test(){
        Inner innerObject = new Inner();
        innerObject.display();
    }

    void testM(){
        System.out.println(outerY);
    }

    class Inner{
        void display(){
            System.out.println("OuterX = "+outerX);
            testM();
        }
    }
}

class InnerClassDemo{
    public static void main(String[] args){
        Outer outerObject  = new Outer();
        outerObject.test();
    }
}