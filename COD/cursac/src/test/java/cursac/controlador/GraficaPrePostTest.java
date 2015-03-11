/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.controlador;

import cursac.datos.DboCurso;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mario Rodas
 */
public class GraficaPrePostTest {
    
    public GraficaPrePostTest() {
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
     * Test of escribirArchivo method, of class GraficaPrePost.
     
    @Test
    public void testEscribirArchivo() {
        System.out.println("escribirArchivo");
        String grafica = "";
        GraficaPrePost instance = new GraficaPrePost(new DboCurso(101,"Matematica basica 1", 5, 1));
        String expResult = "";
        String result = instance.escribirArchivo(grafica);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } */

    /**
     * Test of generarGrafica method, of class GraficaPrePost.
    
    @Test
    public void testGenerarGrafica() {
        System.out.println("generarGrafica");
        GraficaPrePost instance = null;
        String expResult = "";
        String result = instance.generarGrafica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPrerequisitos method, of class GraficaPrePost.
    
    @Test
    public void testObtenerPrerequisitos() {
        System.out.println("obtenerPrerequisitos");
        GraficaPrePost instance = null;
        String expResult = "";
        String result = instance.obtenerPrerequisitos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
     * Test of getCategoria method, of class GraficaPrePost.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        int obligatorio = 1;
        GraficaPrePost instance = new GraficaPrePost(new DboCurso(101,"Matematica basica 1", 5, 1));
        String expResult = "Obligatorio";
        String result = instance.getCategoria(obligatorio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetCategoria2() {
        System.out.println("getCategoria");
        int obligatorio = 0;
        GraficaPrePost instance = new GraficaPrePost(new DboCurso(101,"Matematica basica 1", 5, 1));
        String expResult = "No obligatorio";
        String result = instance.getCategoria(obligatorio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
