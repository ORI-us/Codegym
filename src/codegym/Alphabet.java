
package codegym;


public class Alphabet {
     public boolean check(String input) {
  
        final int size = (int)'z'-(int)'a';
        final int D    = (int)'a'-(int)'A';
         
        if(input.length() < size)
            return false;
        
        for(char i = 'A'; i<='Z'; i++)
        {
            if(input.indexOf(i) < 0 && input.indexOf(i+D) < 0)
            {
                return false;
            }
        }
        
        return true;
   }
}
