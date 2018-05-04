/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.ifal.devops;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ubira
 */
public class HelloWorldTest {
    
    public HelloWorldTest() {
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
     * Test of sayHello method, of class HelloWorld.
     */
    @Test
    public void helloWorldTest() {
        String expResult = "Hello World!";
        String result = HelloWorld.sayHello();
        assertEquals(expResult, result);
    }
}
