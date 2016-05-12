/*
Максимальне Число

Знайти максимальне число в масиві.
Гарантується, що масив завжди не пустий.
*/
package codegym;

/**
 *
 * @author orius
 */
public class FindMaxNumber {
    public int max(int[] input) {
        int k = input[0];
     
        for(int i = 0; i<input.length; i++)
        {
            if(k < input[i])
                k = input[i];
        }
     return k;
  }
}
