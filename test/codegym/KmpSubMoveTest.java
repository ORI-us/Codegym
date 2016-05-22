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
public class KmpSubMoveTest {
    
    public KmpSubMoveTest() {
    }

    @Test
    public void testSubMoveQuantity() {
        System.out.println("subMoveQuantity");

        KmpSubMove instance = new KmpSubMove();

        if(instance.subMoveQuantity("a", "a") != 0)
           fail("The test case is a prototype.");
        
        if(instance.subMoveQuantity("abcd", "cdab") != 2)
           fail("The test case is a prototype.");
        
        if(instance.subMoveQuantity("abracadabra", "racadabraab") != 9)
           fail("The test case is a prototype.");
    }
}
