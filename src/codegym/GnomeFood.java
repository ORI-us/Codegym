/*
В країні гномів прийнято, що більша порція їжі дістається вищому гному. 
Дано два мисиви int[] довжиною N, з висотами гномів в першому і кілограмами їжі в другому. 
Для кожного i-го гнома треба знайти j-ту порцію їжі і записати в результат j-індекси. 
Приклад: [5, 7, 6, 9, 4] - гноми [8, 5, 6, 2, 3] - порції Найвищому гному з висотою 9 дістається найбільша порція 
8 з індексом 0. Другий за висотою гном (7), отримує другу завбільшки порцію (6) з індексом 2, і т.д. 
Найнищий (4) отримує найменшу порцію 2 (індекс 3) Резульнат [4, 2, 1, 0, 3]
*/
package codegym;

import java.util.*;

public class GnomeFood {
   public int[] find(int[] gnames, int[] portions) 
   {
       int length = gnames.length;
              
       int[] sort_g = gnames.clone();
       int[] sort_p = portions.clone();
       
       Arrays.sort(sort_g);
       Arrays.sort(sort_p);
       
       int[] food = new int[length];
       
       for(int i = 0; i<length; i++)
       {
           for(int j = 0; j<length; j++)
           {
               if(sort_g[i] == gnames[j])
               {
                   for(int k = 0; k<length; k++)
                   {
                       if(sort_p[i] == portions[k])
                       {
                           food[j] = k;
                           break;
                       }
                   }
                   break;
               }
           }
       }
       
       return food;
   }
}
