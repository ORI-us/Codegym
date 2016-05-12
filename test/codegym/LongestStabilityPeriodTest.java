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
public class LongestStabilityPeriodTest {
    
    public LongestStabilityPeriodTest() {
    }

    @Test
    public void testCount() {
        System.out.println("count");
        
        LongestStabilityPeriod instance = new LongestStabilityPeriod();

        int[] gdp = {900, 900, 900, 901, 902, 902, 903, 903};
        if(instance.count(gdp) != 4)
          fail("The test case is a prototype.");
        
        int[] gdp1 = {901, 901, 901, 902, 902, 903, 903, 902, 902, 901};
        if(instance.count(gdp1) != 6)
          fail("The test case is a prototype.");
        
        int[] gdp2 = { 900, 902, 904, 906, 908};
        if(instance.count(gdp2) != 1)
          fail("The test case is a prototype.");
    }
    
}
