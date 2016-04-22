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
public class FirstOddNumberTest {
    
    public FirstOddNumberTest() {
    }

    @Test
    public void testFind() {
        System.out.println("find");
        
        FirstOddNumber instance = new FirstOddNumber();
       
        int result = instance.find(new int[] {-11124456, 2, 1246737654, -53646876, 12432, -134466, 98765438,  -2147483648});
        if(result != -1)
            fail("The test case is a prototype.");
        
        result = instance.find(new int[] {-1,2, 4, 5, 12432, 134466, 98765435, 2456});
        if(result != 0)
            fail("The test case is a prototype.");
        
        result = instance.find(new int[] {-136746584, 536462, -987654, 2147483646, -45212432, 26134466, -987654358, 2147483647});
        if(result != 7)
            fail("The test case is a prototype.");
    }
    
}
