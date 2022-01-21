class Employee {
    private int id;
    private String name;
    private String post;
    private double salary;

    Employee(int id, String name, String post, double salary) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    // This overrides the toString() method.
    // Returns a string representation of the object. In general, the toString
    // method returns a string that "textually represents" this object. The result
    // should be a concise but informative representation that is easy for a person
    // to read. It is recommended that all subclasses override this method.
    public String toString() {
        return "ID : " + this.id + "\nName : " + this.name + "\nPost : " + this.post + "\nSalary : " + this.salary;
    }
}

class Two {
    public static void main(String[] args) {
        Employee employeeOne = new Employee(12, "Arjun", "Manager", 12345.90);
        String employee = employeeOne.toString();
        System.out.println(employee);
    }
}

// System.out.println("ID : "+id);
// System.out.println("Name : "+name);
// System.out.println("Post : "+post);
// System.out.println("Salary : "+salary);