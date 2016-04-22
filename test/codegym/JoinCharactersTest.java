
package codegym;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author orius
 */
public class JoinCharactersTest {
    
    public JoinCharactersTest() {
    }

    @Test
    public void testJoin() {
        System.out.println("join");
        char[] input = {'8', 'y', '1', '2', '3', '4', 't', '5', 'm', '9', '0', 'i', 'u', '7', 'k'};
        JoinCharacters instance = new JoinCharacters();
        int expResult = 812345907;
        int result = instance.join(input);
        if(expResult != result)  fail("The test case is a prototype.");
    }
    
}
