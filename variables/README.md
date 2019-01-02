# Variables

## Types of Variables

A. Based on the type of volume
1. Primitive Variables

        int x = 10;
2. Reference Variables

        Student s = new Student ();

B. Based on the position od declaration or behaviour
1. Instance Variable

        class Student{
            String name;
            int rollNo;
        }

        name = "Nishal"  // Student One
        rollNo = 20;

        name = "Biswas"  // Kukur One
        rollNo = 8;

- For every object separate copy of name and rollno is created. This type of variable is instanec variable.
- Instance variable are declared within a class and outside of method / block / constructor.
- Instance variable are created at the time of object creation and destroy when object is destroyed.
- They are also known as attributes.

2. Static Variable
- If the value of variable is not variet from object to object , we create static variable

        class Student{
            static Sting name;
        }

        name = "Nishal" // Student One; Student Two
- Are declared inside class but outside of any method / block / constructor.

    - Scope  
    ⏩ Created at the time of class loading and destroyed at the time of class unloading.
3. Local Variable

