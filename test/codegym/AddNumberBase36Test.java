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
public class AddNumberBase36Test {
    
    public AddNumberBase36Test() {
    }

    @Test
    public void testAdd() {
        System.out.println("add");

        AddNumberBase36 instance = new AddNumberBase36();
        
        String result = instance.add("1", "9");
        if(result.equals("a") == false)
            fail("The test case is a prototype.");
        
        String result1 = instance.add("Z", "1");
        if(result1.equals("10") == false)
            fail("The test case is a prototype.");
        
        String result3 = instance.add("Z", "z");
        if(result3.equals("1y") == false)
            fail("The test case is a prototype.");
        
        String result2 = instance.add("zjfghfhdsdfathjjhgjhghjfjfjhjhdsrreqqklhu456hfz5", "wsfgsgds56346263fgfhghfghfhgfsrr5476hjfgdhdhg3N");
        if(result2.equals("10g7vy7xrkildxnlpkvzwxy0uzwyyzx6kiwixx24xahmjyw2s") == false)
            fail("The test case is a prototype.");
    }
}
