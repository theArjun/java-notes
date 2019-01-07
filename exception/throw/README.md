# Throw

- So farm you have only been catching exceptions that are thrown by the Java run-time system.
- However, it is possible to throw an exception explicitly, using ```throw``` statement.

## General Form :

```throw throwableInstance; ```

**Here, ThrowableInstance must be an object of type Throwable or a subclass of Throwable.**

- There are two ways you can obtain a Throwable Object.
1. Using a parameter in ```catch``` clause
2. Creating one with the ```new``` operator.