/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitNum100;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author misa
 */
public class JUnitNum100Test {
    
    protected int value1, value2;
    
    public JUnitNum100Test() {
    }
    
    @Before
    public void setUp() {
        value1 = 2;
        value2 = 3;
    }
    
    /**
     * Test of main method, of class AdvancedJUnit.
     */
    @Test
    public void testAdd() {
       int result = value1 + value2;
       assertEquals(5, result);
    }
    
    @Test
    public void testSub() {
        int result = value2 - value1;
        assertEquals(1, result);
    }
    
    @Test
    public void testAssertions() {
        String str1 = new String ("abc");
        String str2 = new String ("abc");
        String str3 = null;
        
        String str4 = "aaa";
        String str5 = "aaa";
        
        int val1 = 5;
        int val2 = 6;
        
        String[] resultArray = {"one", "two", "three"};
        String[] expectedArray = {"one", "two", "three"};
        
        // Check if two objects are equal
        assertEquals(str1, str2);
        
        // Check if the condition is true
        assertTrue(val1 < val2);
        // Check if the condition is false
        assertFalse(val1 > val2);
        
        // Checl if an object is not null
        assertNotNull(str1);
        // Check if an object is null
        assertNull(str3);
        
        // Check if two references point to the same object
        assertSame(str4, str5);
        
        // Check if two references do not point to the same object
        assertNotSame(str1, str4);
        // Check if two arrays are equal to each other 
        assertArrayEquals(expectedArray, resultArray);
    }
    
}
