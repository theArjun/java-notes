class Person{
    static int countNo;

    void enterRoom(){
        countNo++;
    }
    
    int count(){
        return countNo;
    }
}