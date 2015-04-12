/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.controlador;

import cursac.modelo.DboCurso;
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

    @Test
    public void testGetPrerequisitos() {
        System.out.println("getPrerequisitos");
        DboCurso curso = new DboCurso(101,"Matematica basica 1", 5, 1);
        GraficaPrePost instance = new GraficaPrePost(curso);
        String expResult = "NINGUNO";
        String result = instance.obtenerPrerequisitos();
        assertEquals(expResult, result);
    }
    
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
