/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.modelo;

import cursac.modelo.DboSalon;
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
public class DboSalonTest {
    
    public DboSalonTest() {
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
     * Test of getId_salon method, of class DboSalon.
     */
    @Test
    public void testGetId_salon() {
        System.out.println("getId_salon");
        DboSalon instance = new DboSalon(1, "101", 1);
        int expResult = 1;
        int result = instance.getId_salon();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId_salon method, of class DboSalon.
     */
    @Test
    public void testSetId_salon() {
        System.out.println("setId_salon");
        int id_salon = 1;
        DboSalon instance = new DboSalon(1, "101", 1);
        instance.setId_salon(id_salon);
        
    }

    /**
     * Test of getNombre method, of class DboSalon.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        DboSalon instance = new DboSalon(1, "101", 1);
        String expResult = "101";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNombre method, of class DboSalon.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "101";
        DboSalon instance = new DboSalon(1, "101", 1);
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getId_edificio method, of class DboSalon.
     */
    @Test
    public void testGetId_edificio() {
        System.out.println("getId_edificio");
        DboSalon instance = new DboSalon(1, "101", 1);
        int expResult = 1;
        int result = instance.getId_edificio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId_edificio method, of class DboSalon.
     */
    @Test
    public void testSetId_edificio() {
        System.out.println("setId_edificio");
        int id_edificio = 1;
        DboSalon instance = new DboSalon(1, "101", 1);
        instance.setId_edificio(id_edificio);
        
    }
    
}
