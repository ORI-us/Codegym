/*
Ланцюжок

Дано ланки трьох кольорів: білого і 1 м завдовжки, жовтого - 2 м і червоного - 3 м.
Скількома способами можна зібрати, з них, ланцюжок довжиною  N.
Кількість наявних ланок кожного кольору вважати бескінечною.
 */

/**
 *
 * @author orius
 */
package codegym;

import java.util.*;

public class ColorChain {

    private ArrayList<Long> List;

    public ColorChain()
    {
        List = new ArrayList<Long>();
        List.add(1L);
        List.add(1L);
        List.add(2L);
    }
    
    private long Factorial(int s)
    {
        if(List.size() <= s)
        {
            long f = Factorial(s-1);
            List.add(f*s);
        }
        
        return List.get(s);
    }

    private int Calculation(int S_1, int S_2, int S_3)
    {
        int Max = S_1;
        if(Max < S_2)
            Max = S_2;
        if(Max < S_3)
            Max = S_3;
        
        long Sum = 1;
        
        for(int i = Max + 1; i<=(S_1+S_2+S_3); i++)
        {
            Sum *= i;
        }
        
        if(S_1 >= S_2 && S_1 >= S_3)
            return (int)(Sum/(Factorial(S_2)*Factorial(S_3)));
        if(S_2 >= S_1 && S_2 >= S_3)
            return (int)(Sum/(Factorial(S_1)*Factorial(S_3)));
        if(S_3 >= S_1 && S_3 >= S_2)
            return (int)(Sum/(Factorial(S_1)*Factorial(S_2)));
        
        return 0;
    }
    
    public int count(int N) 
    {
        int S_3 = N/3;
        int S_2 = 0;
        int S_1 = N%3;
        
        if(S_1 == 2)
        {
            S_1 = 0;
            S_2 = 1;
        }
        
        int ret = 0;
        
        while(S_3 >= 0)
        {
          ret += Calculation(S_1, S_2, S_3);
            
            int S_1B = S_1;
            int S_2B = S_2;
            while(S_2 >= 1)
            {
                S_2--;
                S_1+=2;
                ret += Calculation(S_1, S_2, S_3);
            }
            S_1 = S_1B;
            S_2 = S_2B;
            
            S_3--;
            S_2++;
            S_1++;
            if(S_1 == 2)
            {
                S_2++;
                S_1-=2;
            }
        }
        
        return ret;

    }
}
