# Method Overriding

- In a class hierarchy, when a method in a subclass has the same name and the type signature as a method in its superclass, then the method in the subclass is said to override the method in the superclass.  
- When an overridden method is called from within its subclass, it will always reger to the version of that method defined by the subclass.
- The version of the method defined by the superclass will be hidden.
- If we need to invoke version of superclass, we must use super inside the subclass.