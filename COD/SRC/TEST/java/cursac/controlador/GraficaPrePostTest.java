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
    public void generarGrafica() {
        System.out.println("generarGrafica");
        DboCurso curso = new DboCurso(103,"AREA MATEMATICA BASICA 2", 7, 1);
        GraficaPrePost instance = new GraficaPrePost(curso);
        String expResult = "<ul id=\"org\" style=\"display:none\">\n" +
"            <li>\n" +
"             AREA MATEMATICA BASICA 2<p>Código: 103<br>Créditos: 7<br>Categoria: Obligatorio</p>\n" +
"<ul>\n" +
"<li><a href=\"prepost?id=770\">int(11)RODUCCION A LA PROGRAMACION Y COMPUTACION 1</a><p>Código: 770<br>Créditos: 4</p>\n" +
"<ul>\n" +
"<li><a href=\"prepost?id=771\">INTRODUCCION A LA PROGRAMACION Y COMPUTACION 2</a><p>Código: 771<br>Créditos: 5</p></li>\n" +
"<li><a href=\"prepost?id=796\">LENGUAJES FORMALES Y DE PROGRAMACION</a><p>Código: 796<br>Créditos: 3</p></li>\n" +
"<li><a href=\"prepost?id=962\">MATEMATICA PARA COMPUTACION 2</a><p>Código: 962<br>Créditos: 5</p></li>\n" +
"<li><a href=\"prepost?id=2025\">PRACTICAS INICIALES</a><p>Código: 2025<br>Créditos: 0</p></li>\n" +
"</ul>\n" +
"</li><li><a href=\"prepost?id=795\">LOGICA DE SISTEMAS</a><p>Código: 795<br>Créditos: 2</p>\n" +
"<ul>\n" +
"<li><a href=\"prepost?id=771\">INTRODUCCION A LA PROGRAMACION Y COMPUTACION 2</a><p>Código: 771<br>Créditos: 5</p></li>\n" +
"<li><a href=\"prepost?id=796\">LENGUAJES FORMALES Y DE PROGRAMACION</a><p>Código: 796<br>Créditos: 3</p></li>\n" +
"<li><a href=\"prepost?id=962\">MATEMATICA PARA COMPUTACION 2</a><p>Código: 962<br>Créditos: 5</p></li>\n" +
"</ul>\n" +
"</li><li><a href=\"prepost?id=960\">MATEMATICA PARA COMPUTACION 1</a><p>Código: 960<br>Créditos: 5</p>\n" +
"<ul>\n" +
"<li><a href=\"prepost?id=771\">INTRODUCCION A LA PROGRAMACION Y COMPUTACION 2</a><p>Código: 771<br>Créditos: 5</p></li>\n" +
"<li><a href=\"prepost?id=796\">LENGUAJES FORMALES Y DE PROGRAMACION</a><p>Código: 796<br>Créditos: 3</p></li>\n" +
"<li><a href=\"prepost?id=962\">MATEMATICA PARA COMPUTACION 2</a><p>Código: 962<br>Créditos: 5</p></li>\n" +
"</ul>\n" +
"</li><li><a href=\"prepost?id=2025\">PRACTICAS INICIALES</a><p>Código: 2025<br>Créditos: 0</p>\n" +
"<ul>\n" +
"<li><a href=\"prepost?id=2036\">PRACTICAS int(11)ERMEDIAS</a><p>Código: 2036<br>Créditos: 0</p></li>\n" +
"</ul>\n" +
"</li><li><a href=\"prepost?id=107\">AREA MATEMATICA int(11)ERMEDIA 1</a><p>Código: 107<br>Créditos: 10</p>\n" +
"<ul>\n" +
"<li><a href=\"prepost?id=771\">INTRODUCCION A LA PROGRAMACION Y COMPUTACION 2</a><p>Código: 771<br>Créditos: 5</p></li>\n" +
"<li><a href=\"prepost?id=112\">AREA MATEMATICA INTERMEDIA 2</a><p>Código: 112<br>Créditos: 5</p></li>\n" +
"<li><a href=\"prepost?id=114\">AREA MATEMATICA INTERMEDIA 3</a><p>Código: 114<br>Créditos: 5</p></li>\n" +
"<li><a href=\"prepost?id=732\">ESTADISTICA 1</a><p>Código: 732<br>Créditos: 5</p></li>\n" +
"<li><a href=\"prepost?id=152\">FISICA 2</a><p>Código: 152<br>Créditos: 6</p></li>\n" +
"</ul>\n" +
"</li><li><a href=\"prepost?id=150\">FISICA 1</a><p>Código: 150<br>Créditos: 6</p>\n" +
"<ul>\n" +
"<li><a href=\"prepost?id=152\">FISICA 2</a><p>Código: 152<br>Créditos: 6</p></li>\n" +
"</ul>\n" +
"</li></ul>\n" +
"</li></ul>";
        String result = instance.generarGrafica();
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
