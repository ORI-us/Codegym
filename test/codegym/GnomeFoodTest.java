/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegym;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author orius
 */
public class GnomeFoodTest {
    
    public GnomeFoodTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        
        GnomeFood GF = new GnomeFood();
        
        int[] gnames   = {5, 7, 6, 9, 4};
        int[] portions = {8, 5, 6, 2, 3};
        
        int[] food = GF.find(gnames, portions);
        
        //fail("The test case is a prototype.");
    }
    
}
