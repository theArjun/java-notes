# Nested Try Statement

-  The try statement can be nested i.e , a try can be inside the block of another try.
- Each time a try statement is entered, the contact of that exception is pushed in the track.
- If an inner try statement doesn't have a catch handler for particular exception, the stack is unwound and the next try statement catchb handler are  inspected for a match.