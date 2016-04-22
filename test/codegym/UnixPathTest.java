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
public class UnixPathTest {
    
    public UnixPathTest() {
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

    /**
     * Test of simplify method, of class UnixPath.
     */
    @Test
    public void testSimplify() {
        System.out.println("UnixPath");
        String input = "/../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../...";
        UnixPath instance = new UnixPath();
        String expResult;
        expResult = "/";
        String result = instance.simplify(input);
        
        if(expResult.equals(result))
            System.out.println("all work");
        else
            fail("The test case is a prototype.");
    }
    
}
