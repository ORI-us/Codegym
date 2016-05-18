
package codegym;

/**
 *
 * @author orius
 */
public class Doubles {
  public Double parse(String s) {
 //   StringBuffer SB = new StringBuffer(s);
    
    double D = 0;
    
    try
    {
        D = Double.valueOf(s);
    }
    catch(NumberFormatException nft)
    {
        return null;
    }
    
    return D;
  }
}
