
package codegym;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author orius
 */
public class ReversePolishNotationTest {
    
    public ReversePolishNotationTest() {
    }

    @Test
    public void testEvaluate() {
        System.out.println("evaluate");

        ReversePolishNotation instance = new ReversePolishNotation();

        if(instance.evaluate("2 3 +") != 5)
            fail("The test case is a prototype.");
        
        if(instance.evaluate("10 15 *") != 150)
            fail("The test case is a prototype.");
        
        if(instance.evaluate("115 120 -") != -5)
            fail("The test case is a prototype.");
        
        if(instance.evaluate("45 3 /") != 15)
            fail("The test case is a prototype.");
        
        if(instance.evaluate("12 18 + 32 18 + *") != 1500)
            fail("The test case is a prototype.");
    }
    
}
