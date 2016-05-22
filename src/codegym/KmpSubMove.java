/*
Циклічний Зсув

Дается строка в которой делается несколько циклических сдвигов 
(под циклическим сдвигом понимается перенос последней буквы в начало)
Дается также получившаяся строка
нужно вернуть минимальное количество сдвигов(int) которым можно получить из 1-й строки итоговую
если строку получить циклическим сдвигом нельзя то вывести -1

Например 
Дано:
abcd
cdab

ответ: 2
 */
package codegym;

/**
 *
 * @author orius
 */
public class KmpSubMove {
   public int subMoveQuantity(String inputStr, String resultStr) 
   {
        if(resultStr.equals(inputStr))
            return 0;
                  
       char[] Buf = inputStr.toCharArray();
       int L = inputStr.length() - 1;
       
       for(int i = 1; i<= inputStr.length(); i++)
       {
           char Last = Buf[L];
           
           for(int j = L; j>0; j--)
           {
               Buf[j] = Buf[j-1];
           }
           Buf[0] = Last;
           
           if(resultStr.equals(new String(Buf)))
               return i;
       }
       
    return -1;
  }
}
