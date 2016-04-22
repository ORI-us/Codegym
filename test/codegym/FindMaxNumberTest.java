
package codegym;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author orius
 */
public class FindMaxNumberTest {
    
    public FindMaxNumberTest() {
    }

    @Test
    public void testMax() {
        System.out.println("max");
        
        FindMaxNumber instance = new FindMaxNumber();
        
        int[] input = {0, 1, 2, 3, 4, 5, 6, 7 ,8, 9,};
        int result = instance.max(input);
        if(result != 9)
           fail("The test case is a prototype.");
        
        result = instance.max(new int[] {-1,2, -2147483648, 5, 1-2432, 134466, 98765435, 2456});
        if(result != 98765435)
            fail("The test case is a prototype.");
        
        result = instance.max(new int[] {-1,-2147483648, 4, 5, 12432, 134466, 98765435, 2147483647});
        if(result != 2147483647)
            fail("The test case is a prototype.");
    }
    
}
