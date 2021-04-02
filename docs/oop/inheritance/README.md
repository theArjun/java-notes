# Inheritance

        Super Class --> Sub Class --> Includes all of the member of its superclass.

- uses 'extends' keyword.
- Being a superclass for a subclass doesnot mean that the superclass cannot be send by itself.
- Further, a class can be a super class for another subclass.

General Form : 

        class SubClassName extends SuperClassName{
            // codes goes here
        }

- Java doesn't support multiple inheritance.
- Subclass cannot access private members of the superclass.