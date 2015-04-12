/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.modelo;

import cursac.modelo.DboDia;
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
public class DboDiaTest {
    
    public DboDiaTest() {
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
     * Test of getId_ida method, of class DboDia.
     */
    @Test
    public void testGetId_ida() {
        System.out.println("getId_ida");
        DboDia instance = new DboDia(1, "Domingo");
        int expResult = 1;
        int result = instance.getId_ida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId_ida method, of class DboDia.
     */
    @Test
    public void testSetId_ida() {
        System.out.println("setId_ida");
        int id_ida = 0;
        DboDia instance = new DboDia(1, "Domingo");
        instance.setId_ida(id_ida);
        
    }

    /**
     * Test of getNombre method, of class DboDia.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        DboDia instance = new DboDia(1, "Domingo");
        String expResult = "Domingo";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNombre method, of class DboDia.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Domingo";
        DboDia instance = new DboDia(1, "Domingo");
        instance.setNombre(nombre);
        
    }
    
}
