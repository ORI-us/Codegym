/*
Найдовший Період Стабільності

Дано масив чисел в якому знаходяться значення ВВП за кожен місяць в мільярдах доларів США.
Необхідно знайти найдовший період стабільності.
Період стабільності - період часу де всі значення ВВП попарно відрізняються один від одного максимум на 1.
Повернути кількість місяців.
*/
package codegym;

/**
 *
 * @author orius
 */
public class LongestStabilityPeriod {
    public int count(int[] gdp) {
    
    int size = 1;
    int max_size = 1;
    
    int N = gdp[0];
    
    int j = 0;
    int i = 1;
    int k = 0;
    
    while(i<gdp.length)
    {
        int dif = N - gdp[i];
        if(dif == 0)
        {
            size++;
        }
        else if(dif <= 0 && dif >= -1 && k != -1)
        {
            size++;
            k = -1;
            N = gdp[i];
            j = i;
        }
        else if(dif >= 0 && dif <= 1 && k != 1)
        {
            size++;
            k = 1;
            N = gdp[i];
            j = i;
        }
        else
        {
            if(max_size < size)
                max_size = size;

            if(k != 0)
            {
                i = j;
                k = 0;
            }
            
            size = 1;
        }
        
        i++;
    }
    
    if(max_size < size)
        max_size = size;
    
    return max_size;
  }
}
