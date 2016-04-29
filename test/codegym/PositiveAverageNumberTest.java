
package codegym;

import org.junit.Test;

public class PositiveAverageNumberTest {
    
   
    @Test
    public void testSomeMethod() {
        PositiveAverageNumber P = new PositiveAverageNumber();
        
        int k = P.average(1073741824, 1073741824);
        
        k++;
        
        int z = P.average(-7, -5);
        z++;
    }
    
}
