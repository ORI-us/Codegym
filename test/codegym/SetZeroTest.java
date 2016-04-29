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
public class SetZeroTest {
    
    public SetZeroTest() {
    }

    @Test
    public void testSet() {
        System.out.println("set");
        SetZero instance = new SetZero();
       
        if(instance.set(6, 2) != 4)
            fail("The test case is a prototype.");
        
        if(instance.set(-1, 32) != 2147483647)
            fail("The test case is a prototype.");
        
        if(instance.set(-1, 31) != -1073741825)
            fail("The test case is a prototype.");
    }
    
}
