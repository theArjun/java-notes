# Throw

- So far, you have only been catching exceptions that are thrown by the Java run-time system.
- However, it is possible to throw an exception explicitly, using ```throw``` statement.

## General Form :

```throw throwableInstance; ```

**Here, ThrowableInstance must be an object of type Throwable or a subclass of Throwable.**

- There are two ways you can obtain a Throwable Object.
1. Using a parameter in ```catch``` clause
2. Creating one with the ```new``` operator.

The flow of execution stops immediately after the ```throw``` statement; any subsequent statements are not executed. The nearest enclosing ```try``` block is inspected to see if it has a ```catch``` statement that matches the type of exception. 

It if does find a match, control is transferred to that statement. If not, then the next enclosing try statement is inspected and so on. If no matching catch is found, then the default exception handler halts the program and prints the stack trace. // Error aauni wala  

