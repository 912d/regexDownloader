/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musi.al;

import al.musi.Download;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author re
 */
public class FileDownloaderTest {
    
    public FileDownloaderTest() {
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
     * Test of everythingOkay method, of class Download.
     */
    @Test
    public void testEverythingOkay() {
        System.out.println("everythingOkay");
        Download instance = null;
        Boolean expResult = null;
        Boolean result = instance.everythingOkay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getErrors method, of class Download.
     */
    @Test
    public void testGetErrors() {
        System.out.println("getErrors");
        Download instance = null;
        String expResult = "";
        String result = instance.getErrors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResponse method, of class Download.
     */
    @Test
    public void testGetResponse() {
        System.out.println("getResponse");
        Download instance = null;
        int expResult = 0;
        int result = instance.getResponse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class Download.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Download instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
