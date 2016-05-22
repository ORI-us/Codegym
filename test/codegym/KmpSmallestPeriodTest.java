/*
Найменший Період

A character string is said to have period k if it can be formed by concatenating one or more repetitions of another string of length k.
For example, the string "abcabcabcabc" has period 3, since it is formed by 4 repetitions of the string "abc".
It also has periods 6 (two repetitions of "abcabc") and 12 (one repetition of "abcabcabcabc").
Write a program to read a character string and determine its smallest period
Return (String) substring;
 */
package codegym;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author orius
 */
public class KmpSmallestPeriodTest {
    
    public KmpSmallestPeriodTest() {
    }

    @Test
    public void testFindSmalletstPeriod() {
        System.out.println("findSmalletstPeriod");

        KmpSmallestPeriod instance = new KmpSmallestPeriod();
        String expResult = "abc";
        String result = instance.findSmalletstPeriod("abcabcabcabc");
        if(expResult.equals(result) == false)
               fail("The test case is a prototype.");
        
        expResult = "abdabc";
        result = instance.findSmalletstPeriod("abdabcabdabc");
        if(expResult.equals(result) == false)
               fail("The test case is a prototype.");
    }
    
}
