/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegym;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author orius
 */
public class AlphabetTest {
    
    public AlphabetTest() {
    }

    @Test
    public void testCheck() {
        System.out.println("check");
        String input = "abcdefghijklmnopqrstuvwxyy";
        Alphabet instance = new Alphabet();
        boolean expResult = false;
        boolean result = instance.check(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
