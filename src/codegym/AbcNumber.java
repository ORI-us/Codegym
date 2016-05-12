/*
Буквенні Числа

Дано рядок отриманий шляхом заміни цифр 0,1,2,...,9 певного числа на букви a,b,c,..,j.
Необхідно повернути початкове число маючи конвертований рядок.
Наприклад:
Для "bcd" повернути 123
*/
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
