
package codegym;

/**
 *
 * @author orius
 */
public class SetZero {
  public int set(int num, int i) {

      if(i == 0)
          return num;
      
      int bit = (int)Math.pow(2, i-1);
      if(i != 32)
         bit = ~bit;
      
      num &= bit;
      
      return num;
  }
}
