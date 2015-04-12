/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.modelo;

import cursac.modelo.DboAsignacionHorario;
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
public class DboAsignacionHorarioTest {
    
    public DboAsignacionHorarioTest() {
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
     * Test of getId_seccion method, of class DboAsignacionHorario.
     */
    @Test
    public void testGetId_seccion() {
        System.out.println("getId_seccion");
        DboAsignacionHorario instance = new DboAsignacionHorario(1, 1, 1, 1, 1, 1);
        int expResult = 1;
        int result = instance.getId_seccion();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId_seccion method, of class DboAsignacionHorario.
     */
    @Test
    public void testSetId_seccion() {
        System.out.println("setId_seccion");
        int id_seccion = 1;
        DboAsignacionHorario instance = new DboAsignacionHorario(1, 1, 1, 1, 1, 1);
        instance.setId_seccion(id_seccion);
        
    }

    /**
     * Test of getId_periodo method, of class DboAsignacionHorario.
     */
    @Test
    public void testGetId_periodo() {
        System.out.println("getId_periodo");
        DboAsignacionHorario instance = new DboAsignacionHorario(1, 1, 1, 1, 1, 1);
        int expResult = 1;
        int result = instance.getId_periodo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId_periodo method, of class DboAsignacionHorario.
     */
    @Test
    public void testSetId_periodo() {
        System.out.println("setId_periodo");
        int id_periodo = 1;
        DboAsignacionHorario instance = new DboAsignacionHorario(1, 1, 1, 1, 1, 1);
        instance.setId_periodo(id_periodo);
        
    }

    /**
     * Test of getId_dia method, of class DboAsignacionHorario.
     */
    @Test
    public void testGetId_dia() {
        System.out.println("getId_dia");
        DboAsignacionHorario instance = new DboAsignacionHorario(1, 1, 1, 1, 1, 1);
        int expResult = 1;
        int result = instance.getId_dia();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId_dia method, of class DboAsignacionHorario.
     */
    @Test
    public void testSetId_dia() {
        System.out.println("setId_dia");
        int id_dia = 1;
        DboAsignacionHorario instance = new DboAsignacionHorario(1, 1, 1, 1, 1, 1);
        instance.setId_dia(id_dia);
        
    }

    /**
     * Test of getId_salon method, of class DboAsignacionHorario.
     */
    @Test
    public void testGetId_salon() {
        System.out.println("getId_salon");
        DboAsignacionHorario instance = new DboAsignacionHorario(1, 1, 1, 1, 1, 1);
        int expResult = 1;
        int result = instance.getId_salon();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId_salon method, of class DboAsignacionHorario.
     */
    @Test
    public void testSetId_salon() {
        System.out.println("setId_salon");
        int id_salon = 1;
        DboAsignacionHorario instance = new DboAsignacionHorario(1, 1, 1, 1, 1, 1);
        instance.setId_salon(id_salon);
        
    }

    /**
     * Test of getId_horario method, of class DboAsignacionHorario.
     */
    @Test
    public void testGetId_horario() {
        System.out.println("getId_horario");
        DboAsignacionHorario instance = new DboAsignacionHorario(1, 1, 1, 1, 1, 1);
        int expResult = 1;
        int result = instance.getId_horario();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId_horario method, of class DboAsignacionHorario.
     */
    @Test
    public void testSetId_horario() {
        System.out.println("setId_horario");
        int id_horario = 1;
        DboAsignacionHorario instance = new DboAsignacionHorario(1, 1, 1, 1, 1, 1);
        instance.setId_horario(id_horario);
        
    }

    /**
     * Test of getCodigo method, of class DboAsignacionHorario.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        DboAsignacionHorario instance = new DboAsignacionHorario(1, 1, 1, 1, 1, 1);
        int expResult = 1;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCodigo method, of class DboAsignacionHorario.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 1;
        DboAsignacionHorario instance = new DboAsignacionHorario(1, 1, 1, 1, 1, 1);
        instance.setCodigo(codigo);
        
    }

    /**
     * Test of codigoSeccion method, of class DboAsignacionHorario.
     */
    @Test
    public void testCodigoSeccion() {
        System.out.println("codigoSeccion");
        DboAsignacionHorario instance = new DboAsignacionHorario(1, 1, 1, 1, 1, 1);
        String expResult = "1-1";
        String result = instance.codigoSeccion();
        assertEquals(expResult, result);
        
    }
    
}
