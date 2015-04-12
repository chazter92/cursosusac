/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.datos;

import java.sql.Time;
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
public class DboHorarioTest {
    
    public DboHorarioTest() {
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
     * Test of getId_horario method, of class DboHorario.
     */
    @Test
    public void testGetId_horario() {
        System.out.println("getId_horario");
        DboHorario instance = new DboHorario(1, new Time(7,10,00), new Time(8,00,00));
        int expResult = 1;
        int result = instance.getId_horario();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId_horario method, of class DboHorario.
     */
    @Test
    public void testSetId_horario() {
        System.out.println("setId_horario");
        int id_horario = 1;
        DboHorario instance = new DboHorario(1, new Time(7,10,00), new Time(8,00,00));
        instance.setId_horario(id_horario);
        
    }

    /**
     * Test of getHoraInicio method, of class DboHorario.
     */
    @Test
    public void testGetHoraInicio() {
        System.out.println("getHoraInicio");
        DboHorario instance = new DboHorario(1, new Time(7,10,00), new Time(8,00,00));
        Time expResult = new Time(7,10,00);
        Time result = instance.getHoraInicio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHoraInicio method, of class DboHorario.
     */
    @Test
    public void testSetHoraInicio() {
        System.out.println("setHoraInicio");
        Time horaInicio = new Time(7,10,00);
        DboHorario instance = new DboHorario(1, new Time(7,10,00), new Time(8,00,00));
        instance.setHoraInicio(horaInicio);
        
    }

    /**
     * Test of getHoraFin method, of class DboHorario.
     */
    @Test
    public void testGetHoraFin() {
        System.out.println("getHoraFin");
        DboHorario instance = new DboHorario(1, new Time(7,10,00), new Time(8,00,00));
        Time expResult = new Time(8,00,00);
        Time result = instance.getHoraFin();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHoraFin method, of class DboHorario.
     */
    @Test
    public void testSetHoraFin() {
        System.out.println("setHoraFin");
        Time horaFin = new Time(8,00,00);
        DboHorario instance = new DboHorario(1, new Time(7,10,00), new Time(8,00,00));
        instance.setHoraFin(horaFin);
        
    }
    
}
