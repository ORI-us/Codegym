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
public class BinaryHeapTest {
    
    private BinaryHeap instance, instance1, instance2;
    
    public BinaryHeapTest() {
        instance  = new BinaryHeap(128);
        instance1 = new BinaryHeap(2);
        instance2 = new BinaryHeap(4);
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        
        instance.insert(1);
        instance.insert(2);
        instance.insert(3);
        instance.insert(4);
        instance.insert(5);
        instance.insert(6);
        instance.insert(7);
        instance.insert(8);
        
        if(instance.poll() != 8)
            fail("The test case is a prototype.");
        if(instance.poll() != 7)
            fail("The test case is a prototype.");
        if(instance.poll() != 6)
            fail("The test case is a prototype.");
        if(instance.poll() != 5)
            fail("The test case is a prototype.");
        if(instance.poll() != 4)
            fail("The test case is a prototype.");
        if(instance.poll() != 3)
            fail("The test case is a prototype.");
        if(instance.poll() != 2)
            fail("The test case is a prototype.");
        if(instance.poll() != 1)
            fail("The test case is a prototype.");
       
        instance.insert(2);
        if(instance.poll() != 2)
            fail("The test case is a prototype.");
        
        instance.insert(100);
        instance.insert(99);
        
        if(instance.poll() != 100)
            fail("The test case is a prototype.");
        
        instance.insert(101);
        
        if(instance.poll() != 101)
            fail("The test case is a prototype.");
        
        if(instance.poll() != 99)
            fail("The test case is a prototype.");
        
               
        instance1.insert(1);
        if(instance1.poll() != 1)
            fail("The test case is a prototype.");
        
        instance2.insert(0);
        instance2.insert(1);
        instance2.insert(2);
        instance2.insert(3);
        if(instance2.poll() != 3)
            fail("The test case is a prototype.");
        if(instance2.poll() != 2)
            fail("The test case is a prototype.");
        if(instance2.poll() != 1)
            fail("The test case is a prototype.");
        if(instance2.poll() != 0)
            fail("The test case is a prototype.");
      }
    
}
