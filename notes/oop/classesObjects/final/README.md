# Final

- A field can be declared as final. Doing so prevents its contents from being modified making it essentially a constant.
- Must initialize a final field when it is declared.
- You ca do this in one of two ways :
    1. You can give it a value whn it is declared.

            public class Sample{
                final int h = 8;
            }

    2. You can assign it a value within a constructor.

            public class Sample{
                final int h;
                Sample(){
                    h = 8;
                }
            }

    3. You can't do like this :

            final int a;
            a = 8;