/*
Знайти середнє значення двох цілих чисел. 
Приклади: average( 4, 6 ) = 5 
average( -4, -7 ) = -5 
average( -4, 7 ) = 1
*/
package codegym;

/**
 *
 * @author orius
 */
public class AverageNumber {
  public int average(int a, int b) {
      return (int)(((long)a + (long)b)/2);
  }
}
