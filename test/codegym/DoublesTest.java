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
public class DoublesTest {
    
    public DoublesTest() {
    }

    @Test
    public void testParse() {
        System.out.println("parse");
        Doubles instance = new Doubles();

        if(instance.parse("123.321") != 123.321)
           fail("The test case is a prototype.");
        if(null != instance.parse("-."))
           fail("The test case is a prototype.");
    }
    
}
