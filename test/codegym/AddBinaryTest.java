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
public class AddBinaryTest {
    
    public AddBinaryTest() {
    }

    @Test
    public void testAdd() {
        System.out.println("add");

        AddBinary instance = new AddBinary();

        String result = instance.add("101", "100");
        if(!result.equals("1001"))
            fail("The test case is a prototype.");
        
        result = instance.add("1", "11");
        if(!result.equals("100"))
            fail("The test case is a prototype.");
        
        result = instance.add("11111111111111111", "1");
        if(!result.equals("100000000000000000"))
            fail("The test case is a prototype.");
        
        result = instance.add("10111111111111001", "1");
        if(!result.equals    ("10111111111111010"))
            fail("The test case is a prototype.");
        
        result = instance.add("1", "11111111111111101");
        if(!result.equals         ("11111111111111110"))
            fail("The test case is a prototype.");
        
        result = instance.add("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        if(!result.equals         ("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110"))
            fail("The test case is a prototype.");
    }
    
}
