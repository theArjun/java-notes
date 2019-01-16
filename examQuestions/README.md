# Java Questions for Unit Test I

> 16th December 2019, **Arjun Adhikari**
	
> ✅ in questions denotes the no of question appearence. More the tick in question, possess high importance from examination point of view.

## Chapter 1 
1.	Define Java.
2.	Write about the historical background of JPL. ✅ ✅ ✅
3.	Why and where we use Java Programming Language? ✅
4.	What are the benefits of using Java?
5.	How Java is more secure than other programming languages? Explain.
6.	“Java is Interpreted, High Performance, Dynamic, Secure, Robust”. Explain the statement.
7.	Explain Java Platform with their inter co-related technologies. Draw a sample block diagram to show compile time environment in Java programming.
8.	List down the different features of Java. ✅ ✅
9.	Explain how Java supports multiple platforms, platform independency. ✅ ✅ ✅
10.	How do you differentiate JDK and JRE? What is the significance of having multiple data types in programming language?
11.	What do you mean by Java System Overview? Explain why Java program are known as portable and architecture neutral.
12.	What is the motive behind JVM?  Explain what you mean by JRE.
13.	Is JVM is machine dependent? Explain the use of JVM.  How JVM makes machine dependent.
14.	What do you mean by architectural – neutral?  What are wrapper classes?
15.	What are the uses of Java Virtual Machine in JPL? ✅ ✅ ✅Explain the two types of class loader in JPL.
16.	Explain why Java programs are compiled with bytecodes? ✅ ✅
17.	What is a class file? Differentiate between assignment and initialization with suitable example.
18.	Explain all facilities the Java Programming has over C++. Why it is more popular than C++? ✅ ✅ ✅ -	Portability, platform independence (JVM), Java runs on any platform without recompiling.
19.	Write a program to sort any five names in alphabetical order.
20.	Write a program to print “Hello Nepal” in console. ✅
21.	Write a program to show usage of various data types in Java.
22.	Write a function that takes an array of integers as an argument and returns sum of even numbers in that array.
23.	Write a program to generate the following triangle using for loop.  
1  
0  1  
1  0  1  
0  1  0  1


## Chapter 2

1.	How do you implement the concept of OOP in Java? Explain with an example.
2.	How the concept of reusability can be useful in OOP? Explain with example, in terms of JPL. ✅✅
3.	How does Java support reusability? Provide examples.
4.	What is a class? ✅ How does it accomplish data hiding? Explain with suitable example. What advantages do we have when inheriting from a class whose attributes are protected rather than private?
5.	How are class declared in Java? Illustrate with example.
6.	Show the differences between user defined classes and system defined class. ✅
7.	Explain how we can re-use the user defined classes. 
8.	What is constructor, Explain with example?
9.	State the difference between inner and outer class with the help of suitable example. ✅ 
10.	In what scenario inner use of inner class is preferred? Explain the static and non-static inner classes with example.
11.	Mention the scope of all modifiers (private, default, protected and public). Write suitable program to illustrate the concept.
12.	Write a simple program to show the difference in using and not using static keyword in defining methods.
13.	Explain the key words “public, static, void, private, protected” with reference to JPL. ✅
14.	Discuss about the concept of instance variable hiding in Java. Illustrate with a code example.
15.	Can you override private or static method in Java? Explain with an example.
16.	How inner class helps programmer? Write a short program snippet to show anonymous inner classes. 
17.	Difference between class method and instance method with suitable example.
18.	Explain the difference between method overloading and method overriding? ✅ ✅✅ ✅ ✅
19.	Write a program to show method overriding.
20.	Define polymorphism. How should we implement polymorphism in Java? Explain with example.
21.	Write a java class to demonstrate method overloading. Define a ```sum( )``` method which takes two parameters and displays the sum. The ```sum( )``` method should be overloaded to accept a combination of integer and double type number. ✅
22.	Explain the uses of super and this keyword with suitable examples.
23.	Define inheritance.✅ ✅ ✅ ✅ ✅ Explain different types of inheritance. ✅ How does inheritance reduce the program development time? Explain with example.
24.	Explain the strategy for designing Inheritance. ✅ Describe how we can prevent inheritance.
25.	Explain one method and multiple implementation approach of inheritance with example. 
26.	Write a program deriving two child classes from a base class using Java.
27.	What is the use of abstract keyword? Explain with a suitable program.
28.	How is abstract class different from interfaces? ✅ ✅ ✅ ✅
29.	What is the use of abstract classes in programming?
30.	What is difference between Interface and a class? Explain with an example.
31.	What is an interface? ✅ ✅ ✅ ✅ ✅ ✅  Explain with a suitable example. ✅ ✅
32.	What are the significant uses of interface? Explain how it is implemented in Java. ✅
33.	How do you design and use interface? ✅ ✅
34.	How Java supports Multiple Inheritance? Write a program in Java that shows the concept of Multiple Inheritance. ✅
35.	Why is multiple inheritance not supported in Java. Provide a simple code example to support your answer.
36.	What is runtime polymorphism? Explain how it can be achieved in Java.
37.	What is the difference between static method and non-static method? Can a non-static method be invoked from a static method? Explain with example?
38.	Write a program which has two classes A and B, where A should act as Parent class and B should inherit from A.
39.	Create a class ```Employee``` with ```id, name, post and salary```. Create parameterized constructor to initialize the instance variables. Override the ```toString( )``` method to display the employee details.
40.	Create a class Parts with instance variable ```sno, name, model, price```, constructors to initialize the object, a method to calculate commission which calculates 10% of the price of each item and a method to display the details. Derive a new class ```PartsVAT``` with a method to calculate 13% VAT of the item. Write necessary constructors to that use the super constructors. Test the classes using a main method in third classes.
41.	Write an interface Exam with a method ```pass (int pass)``` that returns a Boolean. Write another interface Classify with a method ```division (int average)``` which returns a string. Write class ```Result``` which implements both Exams and Classify. The pass method should return true if score is greater than 50 otherwise false. The division method must return “First” when average is more than 80, “Second when average is more than 50 otherwise ”No Divison”. 
42.	Write a Java program to demonstrate runtime polymorphism via method overriding. Write the following classes: ```Animal``` as a base class, ```Cat``` (derived class of Animal) and ```Cow``` (derived class of Animal). Write a method ```eat( )``` in Animal class and override that method in the derived classes. 
43.	Implement an abstract class named ```Person``` and two subclasses named ```Student``` and ```Employee``` in Java. A person has a ```name, address, phone number``` and ```e-mail address```. A student has a class ```status (freshman, sophomore, junior or senior)```. Define the ```status``` as a constant. An employee has an ```office, salary and date-hired```. Implement the above classes in Java. Provide Constructors for classes to initialize private variables. Override the ```toString( )``` methods in each class to display class name and the person’s name. Write an application to create objects of type Student and Employee and print the person’s name and the class name of the objects.
44.	Implement an abstract class named ```Book``` and two other subclasses named Novel and Magazine. A ```Book``` has a ```name, author,  total page``` and ```publisher```. Book has an abstract method called ```getBookType( )```. ```Novel``` and ```Magazine``` have field to determine their type. Implement the above classes in Java. Provide constructors for classes to private variables.
45.	Make a class ```Human``` with a ```name``` and ```age```. Make a class ```Employee``` inherit from ```Human```. Add instance variable ```salary``` of double. Supply a method ```showData( )``` that prints the Employee’s ```name, age```, and ```salary```. Make a class ```Manager``` inherit from Employee. Supply appropriate ```showData( )``` methods for all classes. Provide a test program that tests these classes and methods.
46.	Define packages. ✅ ✅
47.	Explain the significance of using package in Java. Differentiate interface with abstract classes.
48.	Write a package of three classes where each class must have at least one function. Also, state the steps to execute the package. ✅ ✅Add illustration.
49.	How packages are created and used in Java? Explain with example. ✅
50.	What is user defined package? Illustrate the process of defining  and using define package with suitable example.
51.	Difference between package and interface in Java. Provide examples for each of them.
52.	Create a class MyClass in a package ```MyPack```. Import newly created class ```MyClass``` form ```IpmClass```.
## Chapter 3
1.	What are exceptions? ✅ ✅ ✅
2.	What do you understand by exceptional handling? Describe about try-catch-finally construct with an example. ✅ ✅ ✅ ✅ ✅
3.	What’s the use of try and catch block in Java? Write down all the exceptions that occur when we are dealing with array.
4.	Define Exceptional Handling with the help of a suitable program. ✅ ✅
5.	Explain the different types of Exceptional Class. ✅
6.	What is usage of exception handling? Define with example.
7.	What is exception handling? Is an error similar to exception? ✅ ✅
8.	Explain how an exception is handled?✅ 
9.	What are the major exception classes used in Java? ✅
10.	How does an exception occur in Java? 
11.	Explain the user defined Exceptions with suitable Java code.
12.	Differentiate between checked and unchecked exceptions with relevant examples.
13.	How you can create your own exceptions in Java? Explain with Program.
14.	Write a program to input an integer from keyboard and print it on the console. Fire an exception if the input is other than integer using try and catch blocks.
15.	Write a program to create your own Arithmetic Exception.
## Chapter 4
1.	Write a program in Java to read a line of string in console mode and display same line as output. ✅ ✅ ✅ ✅
2.	Write a Java program to access an existing file in to your current directory.
3.	Write a program which stores and appends any String value given from keyword into the ```C:\store.txt```.
4.	Write a program to read a text file and display the content on screen.
5.	Write a program to read two integer numbers from the console using the Input Stream. Calculate their sum display in console.
6.	Write a program to store objects of a class Student into a file “student.dat” also reads the objects from same file and display the file state of objects on the screen. Handle possible exceptions.
7.	Explain various stream classes available in Java. Write a program using any stream class for writing text to a file.
8.	Write a program to read content from file “```abc.txt```” and store it in “```xyz.txt```”.
9.	Write a program to write “```Hello World```” in a file ```abc.txt```.
## Short Notes
1.	History of Java
2.	Benefits of Java
3.	Java Virtual Machine (JVM) ✅ & Byte Code
4.	Data Types, Variables and class ✅ ✅
5.	Assignment vs. Initialization
6.	Arrays  
i.	Single Dimensional   
ii.	Multi-Dimensional
7.	Type casting ✅
8.	Inner Class ✅ ✅ ✅ ✅ ✅ ✅
9.	Final Keyword
10.	Access mechanism in Java ✅ ✅ ✅
11.	Static members ✅
12.	Static member variable ✅
13.	Abstract Methods and Classes 
14.	Runtime Polymorphism in Java
15.	Wrapper Classes
16.	Inheritance
17.	Packages
18.	Dynamic Dispatching
19.	Casting Abstract Classes
