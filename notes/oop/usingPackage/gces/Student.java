package gces ;
public class Student{
    String name;
    int rollNo;

    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display(){
        System.out.println("The details of student is :");
        System.out.println("Name = "+name);
        System.out.println("Roll No = "+rollNo);
    }
}