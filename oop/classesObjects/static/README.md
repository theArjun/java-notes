# Static

- When a member is declared static, it ca be acceseed before any objects of its class are created and without reference to any object.
- Can declare on both methods and cariables to e static.
- Instance variable declared as static are essentially gloval variable.
- When objects of its class are declaredm no copy of static vaiable is made.
- All instances of the class share the class static variable.
- Syntax to retrieve class variable and method   
        ```ClassName.variable;
            ClassName.method(); ```

- Methods declared as static have several restrictions:
    1. Thery can onlny directlly call other static methods.
    2. They ca only directly access static data.
    3. They cannot refer to this or super in anyway.