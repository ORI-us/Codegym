
package codegym;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;
/**
 *
 * @author orius
 */
public class MatrixSnakeTraversalTest {
    /**
     * Test of print method, of class MatrixSnakeTraversal.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        int[][] input = {{ 1,                  2,          3, -2147483648},
                         { 4,                  5,          6, -2147483648},
                         { 7,                  8,          9, -2147483648},
                         {2147483647, 2147483647, 2147483647, -2147483648}};
        MatrixSnakeTraversal instance = new MatrixSnakeTraversal();
       
        int[] result = instance.print(input);
        int[] expResult = {1, 4, 7, 2147483647, 2147483647, 8, 5, 2, 3, 6, 9, 2147483647, -2147483648, -2147483648, -2147483648, -2147483648};
        if(Arrays.equals(expResult, result) == false)   fail("The test case is a prototype.");
        
        int[][] input1 = {{1, -2, 3, -4, 5, -6, 7, -8, 9 },
                          {-1, 2, -3, 4, -5, 6, -7, 8, -9 }};
        int[] expResult1 = {1, -1, 2, -2, 3, -3, 4, -4, 5, -5, 6, -6, 7, -7, 8, -8, 9, -9};
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
        int[] expResult2 = {1, 3, 5, 7, 1, 3, 5, 7, 8, 6, 4, 2, 8, 6, 4, 2};
        int[] result2    = instance.print(input2);
        
        if(Arrays.equals(expResult2, result2) == false)   fail("The test case is a prototype.");
    }
}
