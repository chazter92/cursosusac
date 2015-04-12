/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.modelo;

import cursac.modelo.DboEdificio;
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
public class DboEdificioTest {
    
    public DboEdificioTest() {
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
     * Test of getId_edificio method, of class DboEdificio.
     */
    @Test
    public void testGetId_edificio() {
        System.out.println("getId_edificio");
        DboEdificio instance = new DboEdificio(1, "T-3");
        int expResult = 1;
        int result = instance.getId_edificio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId_edificio method, of class DboEdificio.
     */
    @Test
    public void testSetId_edificio() {
        System.out.println("setId_edificio");
        int id_edificio = 1;
        DboEdificio instance = new DboEdificio(1, "T-3");
        instance.setId_edificio(id_edificio);
        
    }

    /**
     * Test of getNombre method, of class DboEdificio.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        DboEdificio instance = new DboEdificio(1, "T-3");
        String expResult = "T-3";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNombre method, of class DboEdificio.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "T-3";
        DboEdificio instance = new DboEdificio(1, "T-3");
        instance.setNombre(nombre);
        
    }
    
}
