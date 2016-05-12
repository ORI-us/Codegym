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
public class RectangleSquareTest {
    
    public RectangleSquareTest() {
    }

    @Test
    public void testMeasure() {
        System.out.println("measure");

        RectangleSquare instance = new RectangleSquare();

        int[] x = {0,   0};
        int[] h = {20, 10};
        int[] w = {10, 20};
        
        if(instance.measure(x, h, w) != 300)
            fail("The test case is a prototype.");
        
        int[] x1 = {0, 10, 30};
        int[] h1 = {20, 10, 20};
        int[] w1 = {20, 30, 20};
        
        if(instance.measure(x1, h1, w1) != 900)
            fail("The test case is a prototype.");
        
        int[] x2 = {0,  10, 20, 20, 30};
        int[] h2 = {10, 20, 30, 10, 20};
        int[] w2 = {60, 40, 10, 20, 10};
        
        if(instance.measure(x2, h2, w2) != 1100)
            fail("The test case is a prototype.");
    }
}
