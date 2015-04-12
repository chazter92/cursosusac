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
public class DboPeriodoTest {
    
    public DboPeriodoTest() {
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
     * Test of getId_periodo method, of class DboPeriodo.
     */
    @Test
    public void testGetId_periodo() {
        System.out.println("getId_periodo");
        DboPeriodo instance = new DboPeriodo(1, "Primer Semestre", 2015);
        int expResult = 1;
        int result = instance.getId_periodo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId_periodo method, of class DboPeriodo.
     */
    @Test
    public void testSetId_periodo() {
        System.out.println("setId_periodo");
        int id_periodo = 1;
        DboPeriodo instance = new DboPeriodo(1, "Primer Semestre", 2015);
        instance.setId_periodo(id_periodo);
        
    }

    /**
     * Test of getSemestre method, of class DboPeriodo.
     */
    @Test
    public void testGetSemestre() {
        System.out.println("getSemestre");
        DboPeriodo instance = new DboPeriodo(1, "Primer Semestre", 2015);
        String expResult = "Primer Semestre";
        String result = instance.getSemestre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSemestre method, of class DboPeriodo.
     */
    @Test
    public void testSetSemestre() {
        System.out.println("setSemestre");
        String semestre = "Primer Semestre";
        DboPeriodo instance = new DboPeriodo(1, "Primer Semestre", 2015);
        instance.setSemestre(semestre);
        
    }

    /**
     * Test of getAnio method, of class DboPeriodo.
     */
    @Test
    public void testGetAnio() {
        System.out.println("getAnio");
        DboPeriodo instance = new DboPeriodo(1, "Primer Semestre", 2015);
        int expResult = 2015;
        int result = instance.getAnio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAnio method, of class DboPeriodo.
     */
    @Test
    public void testSetAnio() {
        System.out.println("setAnio");
        int anio = 2015;
        DboPeriodo instance = new DboPeriodo(1, "Primer Semestre", 2015);
        instance.setAnio(anio);
        
    }
    
}
