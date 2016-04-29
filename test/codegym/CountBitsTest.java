/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegym;

import org.junit.Test;
import static org.junit.Assert.*;


public class CountBitsTest {
    
    public CountBitsTest() {
    }

    @Test
    public void testCount() {
        System.out.println("count");

        CountBits instance = new CountBits();

        if(instance.count(13) != 3)
            fail("The test case is a prototype.");

        if(instance.count(2) != 1)
            fail("The test case is a prototype.");
    }
    
}
