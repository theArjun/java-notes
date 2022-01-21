# Finally

When exceptions are thrown, execution in a method takes a rather abrupt, nonlinear path that alters the normal flow through the method. Depending upon how the method is coded, it is even possible for an exception to cause the method to return prematurely. This could be a problem in some methods.

The ```finally``` keyword is designed to address this kind of problems. ```finally``` creates a block of code that will be executed after a ```try catch``` block has completed and before the code following the ```try catch``` block. The ```finally``` block will be executed whether or not an exception is thrown. 

If an exception is thrown the ```finally``` block will execute even if no catch statement matches the exception. This can be useful for closing file handles and freeing up any other resources. ```finally``` block is optional.

> Note  

Each try statments requires at least one catch or finally clause.