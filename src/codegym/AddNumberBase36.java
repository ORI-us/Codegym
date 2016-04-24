
package codegym;
import java.lang.*;

/**
 *
 * @author orius
 */
public class AddNumberBase36 {
    private int from_36_to_10(char S)
  {
          int N =  (int)S;
          
          if(N >= (int)'A' && N<='Z')
              N -= (int)'A'-10;
          else if(N >= (int)'a')
              N -= (int)'a'-10;
          else 
              N -= (int)('0');
          
      return N;
  }
    
  private char from_int_to_char(int N)
  {
      char C = 0;
      
      if(N<10)
          C = (char)(N + '0');
      if(N >= 10 && N < 36)
          C = (char)(N + 'a' -10);
              
      return C;
  }
  
  private String from_10_to_36(int Sum)
  {
      int Num = Sum/36;
      Sum %= 36;
      
      char t = from_int_to_char(Sum);
      StringBuffer sb = new StringBuffer();
      sb.append(t);

      if(Num > 0)
        sb = sb.insert(0, from_int_to_char(Num));
      
      return sb.toString();
  }
  
  public String add(String a, String b) {
      
       StringBuffer Sum_Buffer;
       Sum_Buffer = new StringBuffer();
       
       int ost = 0;
       for(int a_l = a.length()-1, b_l = b.length()-1; a_l >= 0 || b_l >= 0; a_l--, b_l--)
       {
           int i_a = 0;
           if(a_l >= 0) 
               i_a = from_36_to_10(a.charAt(a_l));
           
           int i_b = 0;
           if(b_l >= 0) 
               i_b = from_36_to_10(b.charAt(b_l));
           
           int Sum = i_a + i_b + ost;
           
           if(Sum > 35)
           {
               Sum -= 36;
               ost  = 1;
           }
           else ost = 0;
        
           Sum_Buffer.insert(0, from_10_to_36(Sum));
       }
       if(ost == 1)
            Sum_Buffer.insert(0, '1');
      
      return Sum_Buffer.toString();
  }
}
