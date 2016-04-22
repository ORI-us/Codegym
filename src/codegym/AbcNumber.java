
package codegym;


public class AbcNumber {
  public int convert(String num) {
      int A = (int)'a';
      int k = (int)num.charAt(0) -A;
      
      for(int i=1; i<num.length(); i++)
      {
          k*=10;
          k += ((int)num.charAt(i) - A);
      }
      
      return k;
  }
}
