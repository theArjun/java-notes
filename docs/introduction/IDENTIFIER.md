# Identifier

- name for program for identification purpose.
- Can be classname, method name, variable name or label name also.
- is case sensitive.
- is any sequence of letters, digits, " _ " , " $ " characters that doesn't begin with a digit.

> How many identifier here ?

        class Hello{
            public static void main(String[] args){
                int numOne = 20;
                int numTwo = 10;
            }
        }

String -> Wrapper Class  
Main -> Name of function  
args -> arguments (variable, used for passing Command Line Arguments)  
numOne, numTwo -> Variable  
Hello -> Class Name  

| username  | ✅ |
|-----------|---|
| #username | ❌ |
| num1      | ✅ | 
| 1num      | ❌ | 

        class Test{
            int num = 10;
            int NUM = 20;
            int Num = 30;
        }

> Java is case-sensitive and all three declaration of variables are valid.

## Notes :  
- Identifier length is not limit. 
- Max character - no length limit 
  
        int while = 20; ❌
        int String = 9; ✅

> String is class name, now reserved word.
  



