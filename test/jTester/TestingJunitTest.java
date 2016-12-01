/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jTester;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Blake
 */
public class TestingJunitTest {
    
    public TestingJunitTest() {
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
     * Test of adder method, of class TestingJunit.
     */
    @Test
    public void testAdder() {
        System.out.println("adder");
        String x = "8";
        String y = "5";
        TestingJunit instance = new TestingJunit();
        int expResult = 13;
        int result = instance.adder(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAdder2() {
        System.out.println("adder");
        String x = "150";
        String y = "foo";
        TestingJunit instance = new TestingJunit();
        int expResult = 0;
        int result = instance.adder(x, y);
        assertEquals(expResult, result);
    }
    
}
