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
public class WordNumberTest {
    
    public WordNumberTest() {
    }

    @Test
    public void testCount() {
        System.out.println("count");

        WordNumber instance = new WordNumber();

        if(instance.count("   araehah stthst   asthsfj JHGF SDFGHJ  khjkj  ") != 6)
         fail("The test case is a prototype.");
        
        if(instance.count("                                               ") != 0)
         fail("The test case is a prototype.");
        
        if(instance.count(" (grhst)argargad     rrh   agsrgsr{argaga} 'fggergreg'   ") != 6)
         fail("The test case is a prototype.");
    }
    
}
