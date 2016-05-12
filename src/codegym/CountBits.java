/*
Кількість біт

Для даного числа порахувати кількість біт.
Наприклад:
Для числа 13 в бінарному вигляді 1101 повернути 3.
*/
package codegym;

/**
 *
 * @author orius
 */
public class CountBits {
  public int count(int num) {
      
      int j = 0;
      for(int i=0; i<32; i++)
      {
          if((num & 1) != 0)
            j++;
          
          num >>= 1;
      }
      
      return j;
  }
}
