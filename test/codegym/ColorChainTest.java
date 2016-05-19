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
public class ColorChainTest {
    
    public ColorChainTest() {
    }

    @Test
    public void testCount() {
        System.out.println("count");
        ColorChain instance = new ColorChain();

        if(instance.count(1) != 1)
          fail("The test case is a prototype.");
        if(instance.count(2) != 2)
          fail("The test case is a prototype.");
        if(instance.count(4) != 7)
          fail("The test case is a prototype.");        
        if(instance.count(6) != 24)
          fail("The test case is a prototype.");
        if(instance.count(20) != 121415)
          fail("The test case is a prototype.");
        if(instance.count(25) != 2555757)
          fail("The test case is a prototype.");
    }
    
}
