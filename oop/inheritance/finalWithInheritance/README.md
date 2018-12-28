# Final with Inheritance

1. as constant
2. Final to prevent overriding inheritance

        class A{
            final void mOne(){
                //code goes here.
            }
        }
        class B extends A{
            void m1(){ // Illegal ; overriding is prohibited.

            }
        }
        
3. To prevent inheritance

        final class A{
            // code goes here
        }
        class B extends A{ // Error
            // code goes here
        }
