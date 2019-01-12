# Program that displays files and directories based on Command Line Arguments passed.

*First path, then filter :)*

## Cases

> No CLA provided :
- It displays all files and directories from the default path.

        javac DisplayWithCLA.java && java Display

> -f or -d provided :
- It displays either files or directories from the default path.

        javac DisplayWithCLA.java && java Display -f // Displays files from default path.
        javac DisplayWithCLA.java && java Display -d // Displays directories from default path.

> Path provided :
- It displays all files and directories from the given path.

        javac DisplayWithCLA.java && java Display C:\users 

> Path with -f or -d provided :

        javac DisplayWithCLA.java && java Display C:\Users -f // Displays files from given path.
        javac DisplayWithCLA.java && java Display C:\users -d // Displays directories from given path.

