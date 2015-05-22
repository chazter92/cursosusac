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
        String[] cursos = {"101-1"};
        CalcularAsignacionTraslape instance = new CalcularAsignacionTraslape(cursos);
        String expResult = "<div class=\"CSSTableGenerator\" ><table border=\"2\"><tr><th>Horario</th><th>Lunes</th><th>Martes</th><th>Miercoles</th><th>Jueves</th><th>Viernes</th><th>Sabado</th><th>Domingo</th></tr><tr><td>07:10</td><td></td><td>AREA MATEMATICA BASICA 1</br>Sección: A</br>T-3   104</td><td>AREA MATEMATICA BASICA 1</br>Sección: A</br>T-3   104</td><td>AREA MATEMATICA BASICA 1</br>Sección: A</br>T-3   104</td><td></td><td>AREA MATEMATICA BASICA 1</br>Sección: A</br>T-3   104</td><td></td></tr><tr><td>08:00</td><td></td><td>AREA MATEMATICA BASICA 1</br>Sección: A</br>T-3   104</td><td>AREA MATEMATICA BASICA 1</br>Sección: A</br>T-3   104</td><td>AREA MATEMATICA BASICA 1</br>Sección: A</br>T-3   104</td><td></td><td>AREA MATEMATICA BASICA 1</br>Sección: A</br>T-3   104</td><td></td></tr></table></div>";
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
        String[] cursos = {"101-1"};
        CalcularAsignacionTraslape instance = new CalcularAsignacionTraslape(cursos);
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
        
        String[] cursos = {"101-1"};
        CalcularAsignacionTraslape instance = new CalcularAsignacionTraslape(cursos);
        instance.calcularAsignacionTraslape();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hayTraslape method, of class CalcularAsignacionTraslape.
     */
    @Test
    public void testHayTraslape() {
        System.out.println("hayTraslape");
        String[] cursos = {"101-1"};
        CalcularAsignacionTraslape instance = new CalcularAsignacionTraslape(cursos);
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
        String[] cursos = {"101-1"};
        CalcularAsignacionTraslape instance = new CalcularAsignacionTraslape(cursos);
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
        String[] cursos = {"101-1"};
        CalcularAsignacionTraslape instance = new CalcularAsignacionTraslape(cursos);
        int expResult = 8;
        int result = instance.totalAsignaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
