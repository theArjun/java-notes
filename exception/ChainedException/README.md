# Chained Exceptions  
- allow to associate another exception with an exception.

> To allow chained Exceptions, two constructors and two methods are added to Throwable.

1. Throwable (Throwable cause Exception)
2. Throwable (String message, Throwable cause Exception)

Two methods used are:

1. Throwable getCause()
2. Throwable initCause (Throwable causeException)