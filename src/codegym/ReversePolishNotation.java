/*
Польський Інверсний Запис

Дано арифметичний вираз у вигляді Польського Інверсного запису.
Необхідно обчислити значення виразу і повернути його.

Вираз складається лише з цілих чисел і операцій +, -, *, /. Гарантується, що результат також ціне число.
*/
package codegym;

/**
 *
 * @author orius
 */
import java.util.*;

public class ReversePolishNotation {
  public int evaluate(String expression) {
    ArrayList<Integer> stack = new ArrayList<Integer>(); 
    
    StringBuffer SB = new StringBuffer(expression);
    SB.append(" ");
    
    int end =0, start = 0;
    
    do
    {
        end = SB.indexOf(" ", start);
        if(end >= 0)
        {
            String num = SB.substring(start, end);
            start += num.length()+1;
            
            if(num.charAt(0) >= '0' && num.charAt(0) <= '9')
            {
                stack.add(Integer.parseInt(num));
            }
            else
            {
                int size = stack.size() - 1;
                switch(num.charAt(0))
                {
                    case '+':
                        stack.set(size - 1, stack.get(size - 1) + stack.get(size));
                        break;
                        
                    case '-':
                        stack.set(size - 1, stack.get(size - 1) - stack.get(size));
                        break;
                    
                    case '*':
                        stack.set(size - 1, stack.get(size - 1) * stack.get(size));
                        break;
                    
                    case '/':
                        stack.set(size - 1, stack.get(size - 1) / stack.get(size));
                        break;
                }
                stack.remove(size);
            }
        }
    }
    while(end >= 0);

    return stack.get(0);
  }
}
