# Throws

- If a method is capable of causing an exception that it doesn't handle, it must specify this behaviour so that colors of the method can guard themself against that exception you do this by including a throws clause in the method declaration.

-  A throw clause lists the type of exception that a method might throw. This is necessary for all exception, except those of type Error and or runtime Exception or any of their subclasses. All other exception that a method can throw must be declared in throw clause. If they are not, a compile time error will occur.

## General Form :

        type methodName (parameter list) throws exceptionList{ / Exception 1, Exception 2 ... etc.
            // code goes here
        }

