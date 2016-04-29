
package codegym;

/**
 *
 * @author orius
 */
public class AddBinary {
   String add(String a, String b) {
    
   StringBuffer Sum = new StringBuffer();
   
   if(a.length()>1 && a.equals(b))
   {
       Sum.insert(0, '0');
       Sum.insert(0, a);
       return Sum.toString(); 
   }
   
   int a_l = a.length()-1;
   int b_l = b.length()-1;
   
   char dodatok = '0';
   
   while(true)
   {
       if(a_l < 0 || b_l < 0)
           if(dodatok == '0')
               break;           
           
       int A = '0';
       if(a_l >= 0)
        A = (int)a.charAt(a_l);
       
       int B = '0';
       if(b_l >= 0)
        B = (int)b.charAt(b_l);
       a_l--; b_l--;
       
       int k = A + B + dodatok;
       dodatok = '0';
       
       if(k == (int)('0' + '0' + '0'))
           Sum.insert(0, '0');
       else if(k == (int)('0' + '1' + '0'))
           Sum.insert(0, '1');
       else if(k == (int)('1' + '1' + '0'))
       {
           Sum.insert(0, '0');
           dodatok = '1';
       }
       else if(k == (int)('1' + '1' + '1'))
       {
           Sum.insert(0, '1');
           dodatok = '1';
       }
   }
   
   if(a_l >= 0)
   {
       Sum.insert(0, a.substring(0, a_l+1));
   }
   else if(b_l >= 0)
   {
       Sum.insert(0, b.substring(0, b_l+1));
   }
      
   return Sum.toString();
  }
}
