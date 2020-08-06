package kunal.Main;

import java.util.Optional;

class Output1
    {
        public static void main(String args[]) 
        {    
             int a = 1;
             int b = 2;
             int c = 3;
             a |= 4;
             b >>= 1;
             c <<= 1;
             a ^= c;
             System.out.println(a + " " + b + " " + c);
             Object o  = null;
            Optional.of(o);
        }
    }
