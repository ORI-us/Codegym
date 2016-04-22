
package codegym;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author orius
 */
public class SumDigitsTest {

    @Test
    public void testSomeMethod() {
        
        SumDigits sumD = new SumDigits();
        int k = sumD.sum(-2147483648);
        if(k != 47)
            fail("The test case is a prototype.");
        k = sumD.sum(2147483647);
        if(k != 46)
            fail("The test case is a prototype.");
    }
    
}
