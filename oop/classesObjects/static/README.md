# Static

- When a member is declared static, it ca be accessed before any objects of its class are created and without reference to any object.
- Can declare on both methods and variables to be static.
- Instance variable declared as static are essentially global variable.
- When objects of its class are declaredm no copy of static vaiable is made.
- All instances of the class share the class static variable.
- Syntax to retrieve class variable and method :  

            ```ClassName.variable;  
            ClassName.method(); ```

- Methods declared as static have several restrictions:
    1. Thery can onlny directly call other static methods.
    2. They can only directly access static data.
    3. They cannot refer to this or super in anyway.