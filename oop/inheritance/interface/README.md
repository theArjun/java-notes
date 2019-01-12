# Interface

> 28th December 2018, <b>Arjun Adhikari</b>

- Using the keyword 'interface', you can fully abstract a class interface from its implementation.
- That is, using interface, you can specify what a class must do, but not how it does it.
- They are syntactically similar to classes, but they lack instance variables ad then mehtods are declared without any body.
- Interfaces are designed to support dynamic method resolution at run time.

## Defining an Interface

        accessModifier interface name{

            returnType methodName(parameterList); // public/abstract method; before JDK 8
            type final varNameOne  = value; // final/static

        }

But beginning with JDK 8, it is possible to add a defailt implementation to an interface method. Thus it is now possible for interface to specify some behaviour.

        default void mOne(){
            // code goes here
        }

## Implementing Interface

        class className [extends superClass] [interface interfaceOne, interfaceTwo]{
            //code goes here
        }

- When you implement an interface method, it must be declared as public.
- Method should be public in interface.
- Class member variable should either be PUBLIC or STATIC.
- The method inside interface can contain the body, if it is DEFAULT.