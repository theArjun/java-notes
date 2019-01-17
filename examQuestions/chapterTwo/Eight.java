class Human {
    private String name;
    private int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class Employee extends Human {
    private double salary;

    Employee(String name, int age, double salary){
        super(name,age);
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {

    Manager(String name, int age, double salary){
        super(name, age, salary);
    }

    public void display() {
        super.display();
    }
}

class Eight {
    public static void main(String[] args) {
        Human humanOne = new Human("Arjun",19);
        humanOne.display();

        Employee employeeOne = new Employee("Hari", 45, 21312.90);
        employeeOne.display();

        Manager managerOne = new Manager("Hari Nath", 45, 21312.90);
        managerOne.display();

        
    }
}