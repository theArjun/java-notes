# Variables

## Types of Variables

A. Based on the type of volume
1. Primitive Variables

        int x = 10;
2. Reference Variables

        Student s = new Student ();

B. Based on the position of declaration or behaviour
1. Instance Variable

        class Student{
            String name;
            int rollNo;
        }
        
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Nishal"  // Student One
        s1.rollNo = 20;

        s2.name = "Biswas"  // Student Two
        s2.rollNo = 8;

- For every object separate copy of name and rollno is created. This type of variable is instance variable.
- Instance variable are declared within a class and outside of method / block / constructor.
- Instance variable are created at the time of object creation and destroyed when object is destroyed.
- They are also known as attributes.

2. Static Variable
- If the value of variable doesn't varies from object to object , we create static variable

        class Student{
            static String name;
        }

        name = "Nishal" // Student One; Student Two
- Are declared inside class but outside of any method / block / constructor.

    - Scope  
    ⏩ Created at the time of class loading and destroyed at the time of class unloading.

3. Local Variable

        [method]
        void mOne(){
            int x = 10; // is not available outside method mOne.
        }

        [block]
        for(int i = 0; i<5; i++){
            System.out.println(i); // is not available outside for loop.
        }

        [constructor]
        Test(){
            int x = 10;
        }

 - aka Local / Temporary / Stack / Automatic
 - are stored in stack memory.
 - Scope :
    ⏩ Destroyed after finishing method / block / constructor
 - For every thread separate, local variable is created.
 - For local variable, JVM won't provide default value. So, we must provide value explicitly before using it.
 - For local variable, the only applicable modifier is final. 

## Examples
#### Life Time Of Variables
```java
{% include 'variables/lifeTImeOfVariable.java' %}
```

#### Scope of Variables - I
```java
{% include 'variables/scopeOfVariables.java' %}
```

#### Scope of Variables - II
```java
{% include 'variables/scopeOfVariablesOne.java' %}
```


#### Dynamic Initialization of Variables
```java
{% include 'variables/dynamicInitializationOfVariables.java' %}
```

#### Type Conversion
```java
{% include 'variables/typeConversion.java' %}
```
