/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.controlador;

import cursac.modelo.DboAsignacionHorario;
import java.util.ArrayList;
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
public class CalcularAsignacionTraslapeTest {
    
    public CalcularAsignacionTraslapeTest() {
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
     * Test of graficaHorario method, of class CalcularAsignacionTraslape.
     */
    @Test
    public void testGraficaHorario() {
        System.out.println("graficaHorario");
        CalcularAsignacionTraslape instance = null;
        String expResult = "";
        String result = instance.graficaHorario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of detalleTraslapes method, of class CalcularAsignacionTraslape.
     */
    @Test
    public void testDetalleTraslapes() {
        System.out.println("detalleTraslapes");
        CalcularAsignacionTraslape instance = null;
        String expResult = "";
        String result = instance.detalleTraslapes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularAsignacionTraslape method, of class CalcularAsignacionTraslape.
     */
    @Test
    public void testCalcularAsignacionTraslape() {
        System.out.println("calcularAsignacionTraslape");
        CalcularAsignacionTraslape instance = null;
        instance.calcularAsignacionTraslape();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAsginaciones method, of class CalcularAsignacionTraslape.
     */
    @Test
    public void testGetAsginaciones() {
        System.out.println("getAsginaciones");
        CalcularAsignacionTraslape instance = null;
        ArrayList<DboAsignacionHorario> expResult = null;
        ArrayList<DboAsignacionHorario> result = instance.getAsginaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAsginaciones method, of class CalcularAsignacionTraslape.
     */
    @Test
    public void testSetAsginaciones() {
        System.out.println("setAsginaciones");
        ArrayList<DboAsignacionHorario> asginaciones = null;
        CalcularAsignacionTraslape instance = null;
        instance.setAsginaciones(asginaciones);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTraslapes method, of class CalcularAsignacionTraslape.
     */
    @Test
    public void testGetTraslapes() {
        System.out.println("getTraslapes");
        CalcularAsignacionTraslape instance = null;
        ArrayList<DboAsignacionHorario> expResult = null;
        ArrayList<DboAsignacionHorario> result = instance.getTraslapes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTraslapes method, of class CalcularAsignacionTraslape.
     */
    @Test
    public void testSetTraslapes() {
        System.out.println("setTraslapes");
        ArrayList<DboAsignacionHorario> traslapes = null;
        CalcularAsignacionTraslape instance = null;
        instance.setTraslapes(traslapes);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hayTraslape method, of class CalcularAsignacionTraslape.
     */
    @Test
    public void testHayTraslape() {
        System.out.println("hayTraslape");
        CalcularAsignacionTraslape instance = null;
        boolean expResult = false;
        boolean result = instance.hayTraslape();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of totalTraslapes method, of class CalcularAsignacionTraslape.
     */
    @Test
    public void testTotalTraslapes() {
        System.out.println("totalTraslapes");
        CalcularAsignacionTraslape instance = null;
        int expResult = 0;
        int result = instance.totalTraslapes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of totalAsignaciones method, of class CalcularAsignacionTraslape.
     */
    @Test
    public void testTotalAsignaciones() {
        System.out.println("totalAsignaciones");
        CalcularAsignacionTraslape instance = null;
        int expResult = 0;
        int result = instance.totalAsignaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
