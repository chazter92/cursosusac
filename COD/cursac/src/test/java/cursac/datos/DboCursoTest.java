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
 * @author Mario Rodas
 */
public class DboCursoTest {
    
    public DboCursoTest() {
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
     * Test of getCodigo method, of class DboCurso.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        DboCurso instance = new DboCurso(101,"Matematica basica 1", 5, 1);
        int expResult = 101;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class DboCurso.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 101;
        DboCurso instance = new DboCurso(101,"Matematica basica 1", 5, 1);
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class DboCurso.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        DboCurso instance = new DboCurso(101,"Matematica basica 1", 5, 1);
        String expResult = "Matematica basica 1";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class DboCurso.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Matematica basica 2";
        DboCurso instance = new DboCurso(101,"Matematica basica 1", 5, 1);
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCreditos method, of class DboCurso.
     */
    @Test
    public void testGetCreditos() {
        System.out.println("getCreditos");
        DboCurso instance = new DboCurso(101,"Matematica basica 1", 5, 1);
        int expResult = 5;
        int result = instance.getCreditos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCreditos method, of class DboCurso.
     */
    @Test
    public void testSetCreditos() {
        System.out.println("setCreditos");
        int creditos = 5;
        DboCurso instance = new DboCurso(101,"Matematica basica 1", 5, 1);
        instance.setCreditos(creditos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getObligatorio method, of class DboCurso.
     */
    @Test
    public void testGetObligatorio() {
        System.out.println("getObligatorio");
        DboCurso instance = new DboCurso(101,"Matematica basica 1", 5, 1);
        int expResult = 1;
        int result = instance.getObligatorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setObligatorio method, of class DboCurso.
     */
    @Test
    public void testSetObligatorio() {
        System.out.println("setObligatorio");
        int obligatorio = 0;
        DboCurso instance = new DboCurso(101,"Matematica basica 1", 5, 1);
        instance.setObligatorio(obligatorio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
