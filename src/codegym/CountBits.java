
package codegym;

/**
 *
 * @author orius
 */
public class CountBits {
  public int count(int num) {

      int bit = 1;
      
      int j = 0;
      for(int i=0; i<32; i++)
      {
          if((num & bit) != 0)
            j++;
          
          bit <<= 1;
      }
      
      return j;
  }
}
