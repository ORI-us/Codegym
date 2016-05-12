/*
Вставити Нуль

Дано число. Треба замінити i-й біт замінити на нуль.
Наприклад:
для числа 6 в бінарному вигляді 110, 
замінивши 2-й біт на нуль отримаємо 100 тобто 4.
1<= i <= 32
*/
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
