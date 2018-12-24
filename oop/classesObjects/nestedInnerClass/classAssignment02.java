class Outer{
    int outerX = 100;
    void test(){
        Inner innerObject  = new Inner();
        innerObject.display();
    }

    class Inner{
        int y = 10;
        void display(){
            System.out.println("Display : outerX = "+outerX);
        }
    }

    void showY(){
        System.out.println(y); // Error Y is not shown here.
    }
}

class InnerClassDemo{
    public static void main (String[] args){
        Outer outerObect  = new Outer();
        outerObect.test();

        Inner fakeInnerObject  = new Inner(); // X
    }
}