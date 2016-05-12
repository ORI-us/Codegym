/*
Сума Цифр

Обчислити суму цифр числа.
Наприклад сума цифр числа 123 дорівнює  6.
*/
package codegym;

public class SumDigits {
      public int sum(int n) 
      {
          int Sum = 0;
          long D;
          int i = 10;
          long number=n;
          
          if(number < 0)
              number = ~number + 1;
          
          while(true)
          {
              D = number/i;
              
              if(D < 10)
                  break;
              
              i *= 10;
          }
          
          while(true)
          {
              Sum += D;
              number -= D*i;
              i /= 10;
              
            if(i < 1)
                  break;
                            
              D = number/i;
          }
                    
          return Sum;
      }
}
