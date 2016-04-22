
package codegym;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PositiveAverageNumberTest {
    
    public PositiveAverageNumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        PositiveAverageNumber P = new PositiveAverageNumber();
        
        int k = P.average(1073741824, 1073741824);
        
        k++;
    }
    
}
