/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.datos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chaz
 */
public class DboSeccionTest {
    
    public DboSeccionTest() {
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
     * Test of getId_seccion method, of class DboSeccion.
     */
    @Test
    public void testGetId_seccion() {
        System.out.println("getId_seccion");
        DboSeccion instance = new DboSeccion(1, "A");
        int expResult = 1;
        int result = instance.getId_seccion();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId_seccion method, of class DboSeccion.
     */
    @Test
    public void testSetId_seccion() {
        System.out.println("setId_seccion");
        int id_seccion = 1;
        DboSeccion instance = new DboSeccion(1, "A");
        instance.setId_seccion(id_seccion);
        
    }

    /**
     * Test of getSeccion method, of class DboSeccion.
     */
    @Test
    public void testGetSeccion() {
        System.out.println("getSeccion");
        DboSeccion instance = new DboSeccion(1, "A");
        String expResult = "A";
        String result = instance.getSeccion();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSeccion method, of class DboSeccion.
     */
    @Test
    public void testSetSeccion() {
        System.out.println("setSeccion");
        String seccion = "A";
        DboSeccion instance = new DboSeccion(1, "A");
        instance.setSeccion(seccion);
       
    }
    
}
