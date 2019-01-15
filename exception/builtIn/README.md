#Java's Built-in Exceptions

```java.lang```

- Most general of these exceptions are subclasses of the standard type RuntimeException.

1. Checked Exception  
- That must be included in a method's throw list if that method can generate one of these Exception and does not handle itself.

eg: ```ClassNotFOundException, IllegalAccessException```

2. Unchecked Exception
- These exceptio need not be included in any method's throw list. 
- Compiler doesn't check to see if a method handles or throw these exception.
eg: ```ArithmeticException, ArrayIndexOutofBoundsException```