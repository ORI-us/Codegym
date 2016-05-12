/*
Злічити Слова

Дано рядок. Порахувати кількість слів. 
Словом вважається послідовність символів англійського алфавіту [a-zA-Z].

Алгоритм повинен працювати за O(N) часу, тому RegExp використовувати не можна.
*/
package codegym;

public class WordNumber {
  public int count(String input) {

      int size = 0;
      
      int i = 0;
          
      while(i<input.length())
      {
          char k = input.charAt(i);
          
          if((k >= 'a' && k<= 'z') || (k >= 'A' && k <= 'Z'))
          {
              size++;
              i++;
              
              while(i<input.length())
              {
                  k = input.charAt(i);
                  if((k >= 'a' && k<= 'z') || (k >= 'A' && k <= 'Z'))
                    i++;
                  else
                    break;
              }
          }
          else
              i++;
      }
      
      return size;
  }
}
