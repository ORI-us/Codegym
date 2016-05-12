/*
Площа прямокутників

Знайти площу яку займають N прямокутників на площині.
У всіх прямокутників одна зі сторін лежить на осі абсцис (X).
Дано три масива довжиною N. 
В першому масиві Х координата нижньої-лівої вершини і-го прямокутника , 
висота в другому, ширина в третьому. Всі значення невід'ємні.
Приклад:
X - [0, 0]
H - [20, 10]
W - [10, 20]
Відповідь - 300.
*/
package codegym;

/**
 *
 * @author orius
 */
public class RectangleSquare {
    public int measure(int[] x, int[] h, int[] w) {
    
    int size = x.length;   
    int[] y  = new int[size];
        
    int square = 0;
    
    for(int i = 0; i < size; i++)
    {
        for(int j = i + 1; j < size; j++)
        {
            if(x[i] <= x[j])
            {
                if(x[i] + w[i] >= x[j] + w[j])
                {
                    if(h[i] >= h[j])
                    {
                        x[j] = 0; h[j] = 0; w[j] = 0;
                    }
                    else
                    {
                        y[j] = h[i];
                        h[j] = h[j] - h[i];
                    }
                }
                else if(x[i] + w[i] < x[j] + w[j] && x[i] + w[i] > x[j])
                {
                    if(h[i] >= h[j])
                    {
                        w[j] = (x[j] + w[j]) - (x[i] + w[i]);
                        x[j] =  x[i] + w[i];
                    }
                    else
                    {
                        w[i] = x[j] - x[i];
                    }
                }
            }
            else if(x[i] >= x[j] && x[i] <= x[j] + w[j])
            {
                if(x[i] + w[i] >= x[j] + w[j])
                {
                    if(h[i] >= h[j])
                    {
                        w[j] = x[i] - x[j];
                    }
                    else
                    {
                        x[i] = x[j] + w[j];
                    }
                }
                else
                {
                    if(h[i] >= h[j])
                    {
                        y[i] = h[j];
                    }
                    else
                    {
                        x[i] = 0; h[i] = 0; w[i] = 0;
                    }
                }
            }
        }
        
        int s = w[i]*h[i];
        
        square += s;
    }

    return square;
  }
}
