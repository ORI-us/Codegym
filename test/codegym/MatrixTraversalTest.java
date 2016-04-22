
package codegym;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

/**
 *
 * @author orius
 */
public class MatrixTraversalTest {
  
    @Test
    public void testPrint() {
        System.out.println("print");
        int[][] input = {{ 1,                  2,          3, -2147483648},
                         { 4,                  5,          6, -2147483648},
                         { 7,                  8,          9, -2147483648},
                         {2147483647, 2147483647, 2147483647, -2147483648}};
        MatrixTraversal instance = new MatrixTraversal();
        int[] result = instance.print(input);
        int[] expResult = {           1,           2,           3, -2147483648, 
                            -2147483648, -2147483648, -2147483648,  2147483647, 
                             2147483647,  2147483647,           7,           4, 
                                      5,           6,           9,           8};
        if(Arrays.equals(expResult, result) == false)   fail("The test case is a prototype.");
 
        int[][] input1 = {{1, -2, 3, -4, 5, -6, 7, -8, 9 },
                          {-1, 2, -3, 4, -5, 6, -7, 8, -9 }};
        int[] expResult1 = {1, -2, 3, -4, 5, -6, 7, -8, 9, -9, 8, -7, 6, -5, 4, -3, 2, -1};
        int[] result1    = instance.print(input1);
        
        if(Arrays.equals(expResult1, result1) == false)   fail("The test case is a prototype.");
        
        int[][] input2   = {{1, 2}, 
                            {3, 4}, 
                            {5, 6}, 
                            {7, 8},
                            {1, 2}, 
                            {3, 4}, 
                            {5, 6}, 
                            {7, 8}};
        int[] expResult2 = {1, 2, 4, 6, 8, 2, 4, 6, 8, 7, 5, 3, 1, 7, 5, 3};
        int[] result2    = instance.print(input2);
        
        if(Arrays.equals(expResult2, result2) == false)   fail("The test case is a prototype.");
    }
}
