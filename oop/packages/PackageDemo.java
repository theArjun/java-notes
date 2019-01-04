import gces.Student;

class PackageDemo{
    public static void main(String[] args){
        Student studentObjectOne = new Student("Bishal",10);
        Student studentObjectTwo = new Student("Nishal",20);

        studentObjectOne.display();
        studentObjectTwo.display();
    }
}
