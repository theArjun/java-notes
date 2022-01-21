# Nested Interface

**We can declare an interface in another interface or class. Such an interface is termed as a nested interface.**

Following are the rules governing a nested interface.

1.  A nested interface declared within an interface must be public.
2.  A nested interface declared within a class can have any access modifier.
3.  A nested interface is by default static.

Such interface can be declared a member of class or another interface such as interface is called a member interface. It can be declared as public, protected or private.

        interface OuterInterface{
            interface InnerInterface{
                // code goes here.
            }
        }