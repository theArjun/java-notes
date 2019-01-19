abstract class Person 
{
    String name, address, phoneNumber, email;
    Person(String name, String address, String phoneNumber, String email) 
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    abstract public String toString();
}


class Student extends Person
{
    final String status; // Provide status as (freshman, sophomore, junior or senior.)
    Student(String name, String address, String phoneNumber, String email, String status) 
    {
        super(name, address, phoneNumber, email);
        this.status = status;
    }
    @Override
    public String toString() 
    {
        return "Class Name: " + this.getClass().getName() + "\nName: " + this.name;
    }
}

class Employee extends Person 
{
    String office, salary, dateHired;

    Employee(String name, String address, String phoneNumber, String email, String office, String salary, String dateHired) 
    {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    @Override
    public String toString() 
    {
        return "Class Name: " + this.getClass().getName() + "\nName: " + this.name;
    }
}

public class Six
{
    public static void main(String[] args)
    {
        Student studentOne = new Student("Arjun Adhikari", "Pokhara", "9800011111", "mailarjunadhikari@gmail.com", "Senior");
        Employee employeeOne = new Employee("Anil Adhikari", "Pokhara", "982211111", "mailaniladhikari@gmail.com", "Human Resources", "234454.90", "1 January 2019");
        String display = studentOne.toString();
        System.out.println(display);
        display = employeeOne.toString();
        System.out.println(display);
    }
}
