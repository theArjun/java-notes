# Nested Try Statement

-  The try statement can be nested i.e , a try can be inside the block of another try.
- Each time a try statement is entered, the contact of that exception is pushed in the track.
- If an inner try statement doesn't have a catch handler for particular exception, the stack is unwound and the next try statement catch handler are  inspected for a match. This continues until one of the catch statement succeeds or until all of the nested try statments are exhausted. If no catch statements matches then the Java Runtime System will handle the exception.