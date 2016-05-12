/*
Перше Непарне Число

Знайти перше непарне число і повернути його індекс.
Якщо такого немає, повернути -1
*/
package codegym;

/**
 *
 * @author orius
 */
public class FirstOddNumber {
    public int find(int[] input) {

        int k = -1;

        for(int i=0; i<input.length; i++)
        {
          if(input[i]%2 != 0)
          {
            return i;
          }
        }

        return k;
      }
}
