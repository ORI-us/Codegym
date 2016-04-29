
package codegym;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author orius
 */
public class AverageNumberTest {
    
    public AverageNumberTest() {
    }

    @Test
    public void testSomeMethod() {
        
        AverageNumber AN = new AverageNumber();
        
        if(AN.average(4, 6) != 5)        
            fail("The test case is a prototype.");
        
        if(AN.average(-4, -7) != -5)        
            fail("The test case is a prototype.");
                
        if(AN.average(-4, 7) != 1)        
            fail("The test case is a prototype.");
    }
    
}
