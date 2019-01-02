class PersonDemo{
    public static void main(String[] args){
        Person personObjectOne = new Person();
        Person personObjectTwo = new Person();

        personObjectOne.enterRoom();
        personObjectOne.enterRoom();

        personObjectTwo.enterRoom();
        personObjectTwo.enterRoom();

        System.out.println("Total count = "+personObjectOne.countNo);
    }
}